# Analysis script for the in-vivo testing paper

library(xtable)

apps = c("amazefm", "forecastie", "materialistic", "redreader", "timber", "uhabits")
app.versions = c("c", "f")
devices = c("moto-e5-play", "google-pixel2", "oneplus-6t")
scenarios = c("scenario1", "scenario2", "scenario3", "scenario4")

final.data = data.frame(matrix(NA, nrow = length(apps) * length(devices) - 1, ncol = 15))
colnames(final.data) = c("app", "device", "c-cpu-mean", "f-cpu-mean", "cpu-delta%", "cpu-p-val", "c-mem-mean", "f-mem-mean", "mem-delta%", "mem-p-val", "c-net-mean", "f-net-mean", "net-delta", "net-delta%", "net-p-val")

count = 0

for (app in apps) {
  for (device in devices) {
    count = count + 1
    device.cpu.sum.c = c()
    device.cpu.sum.f = c()
    device.cpu.n.pval = 0
    device.mem.ave.c = c()
    device.mem.ave.f = c()
    device.mem.n.pval = 0
    device.net.sum.c = c()
    device.net.sum.f = c()
    device.net.n.pval = 0
    if (app == "uhabits" && device == "moto-e5-play") {
      count = count - 1
    } else {
      for (scenario in scenarios) {
        cpu.sum.c = c()
        cpu.sum.f = c()
        mem.ave.c = c()
        mem.ave.f = c()
        net.sum.c = c()
        net.sum.f = c()
        for (repetition in c(0:9)) {
          for (app.version in app.versions) {
            cpu.path = paste(app, "-", app.version, "/", device, "/", scenario, "/", repetition, "_cpu.csv", sep = "")
            data = read.csv(cpu.path)
            cpu.area = 0
            for (i in c(1:(nrow(data) - 1))) {
              area.temp = ((data$time_ms[i + 1] - data$time_ms[i]) / 1000) * data$cpu_percent[i]
              cpu.area = cpu.area + area.temp
              rm(area.temp)
            }
            #for (i in c(2:nrow(data))) {
            #  area.temp = ((data$time_ms[i] - data$time_ms[i - 1]) / 1000 * (data$cpu_percent[i] + data$cpu_percent[i - 1])) / 2
            #  cpu.area = cpu.area + area.temp
            #}
            if (app.version == "c") {
              cpu.sum.c = c(cpu.sum.c, cpu.area)
            } else if (app.version == "f") {
              cpu.sum.f = c(cpu.sum.f, cpu.area)
            }
            rm(cpu.area, data, cpu.path)
          
            
            
            
            
            mem.path = paste(app, "-", app.version, "/", device, "/", scenario, "/", repetition, "_memory.csv", sep="")
            data = read.csv(mem.path)
            mem.ave = 0
            for (i in c(1:(nrow(data) - 1))) {
              area.temp = ((data$time_ms[i + 1] - data$time_ms[i]) / 1000) * data$memory_kbytes[i]
              mem.ave = mem.ave + area.temp
              rm(area.temp)
            }
            mem.ave = mem.ave / (data$time_ms[nrow(data)] / 1000)
            mem.ave = mem.ave / 1024 # kB to MB
            if (app.version == "c") {
              mem.ave.c = c(mem.ave.c, mem.ave)
            } else if (app.version == "f") {
              mem.ave.f = c(mem.ave.f, mem.ave)
            }
            rm(data, mem.path, mem.ave)
            
            
            
            
            
            
            
            
            net.path = paste(app, "-", app.version, "/", device, "/", scenario, "/", repetition, "_network.csv", sep="")
            data = read.csv(net.path)
            net.sum = 0
            for (i in c(1:(nrow(data) - 1))) {
              area.temp = (((data$time_ms[i + 1] - data$time_ms[i]) / 1000) * (data$sent_bytes_sec[i] + data$received_bytes_sec[i]))
              net.sum = net.sum + area.temp
            }
            
            net.sum = net.sum / 1024 # B to kB
            
            if (app.version == "c") {
              net.sum.c = c(net.sum.c, net.sum)
            } else if (app.version == "f") {
              net.sum.f = c(net.sum.f, net.sum)
            }
            rm(data, net.path, net.sum)
          }
        }
        
        device.cpu.sum.c = c(device.cpu.sum.c, cpu.sum.c)
        device.cpu.sum.f = c(device.cpu.sum.f, cpu.sum.f)
        if (wilcox.test(cpu.sum.c, cpu.sum.f, alternative = "less")$p.value < 0.05) {
          device.cpu.n.pval = device.cpu.n.pval + 1
        }
        
        device.mem.ave.c = c(device.mem.ave.c, mem.ave.c)
        device.mem.ave.f = c(device.mem.ave.f, mem.ave.f)
        if (wilcox.test(mem.ave.c, mem.ave.f, alternative = "less")$p.value < 0.05) {
          device.mem.n.pval = device.mem.n.pval + 1
        }
        
        device.net.sum.c = c(device.net.sum.c, net.sum.c)
        device.net.sum.f = c(device.net.sum.f, net.sum.f)
        if (wilcox.test(net.sum.c, net.sum.f, alternative = "less")$p.value < 0.05) {
          device.net.n.pval = device.net.n.pval + 1
        }
      }
      
      final.data[count, "app"] = app
      final.data[count, "device"] = device
      #final.data[count, "scenario"] = scenario
      final.data[count, "c-cpu-mean"] = mean(device.cpu.sum.c)
      #final.data[count, "c-cpu-sd"] = sd(cpu.sum.c)
      final.data[count, "f-cpu-mean"] = mean(device.cpu.sum.f)
      #final.data[count, "f-cpu-sd"] = sd(cpu.sum.f)
      final.data[count, "cpu-delta%"] = (mean(device.cpu.sum.f) / mean(device.cpu.sum.c)) * 100 - 100
      final.data[count, "cpu-p-val"] = device.cpu.n.pval
      final.data[count, "c-mem-mean"] = mean(device.mem.ave.c)
      #final.data[count, "c-mem-sd"] = sd(mem.ave.c)
      final.data[count, "f-mem-mean"] = mean(device.mem.ave.f)
      #final.data[count, "f-mem-sd"] = sd(mem.ave.f)
      final.data[count, "mem-delta%"] = (mean(device.mem.ave.f) / mean(device.mem.ave.c)) * 100 - 100
      final.data[count, "mem-p-val"] = device.mem.n.pval
      final.data[count, "c-net-mean"] = mean(device.net.sum.c)
      #final.data[count, "c-net-sd"] = sd(net.sum.c)
      final.data[count, "f-net-mean"] = mean(device.net.sum.f)
      #final.data[count, "f-net-sd"] = sd(ne.sum.f)
      final.data[count, "net-delta"] = mean(device.net.sum.f) - mean(device.net.sum.c)
      final.data[count, "net-delta%"] = (mean(device.net.sum.f) / mean(device.net.sum.c)) * 100 - 100
      final.data[count, "net-p-val"] = device.net.n.pval
    }
  }
}

x = xtable(final.data, label="tab:direbase-experiment-result", digits = c(0, 100, 100, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0))
print(x, file="tabs/tab.rq2.tex", include.rownames = FALSE)

