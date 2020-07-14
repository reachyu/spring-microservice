# 简介
* SpringCloud搭建微服务的步骤，用到了Eureka、Ribbon、Feign、Hystrix、Zuul、Config技术
* 实际场景中，生产者和消费者工程是分开的。这个实例就把生产者和消费者放在一个工程里。
* 详情请见我的博客：https://blog.csdn.net/reachyu
# 分支说明
* master：基础的服务提供者、消费者代码
* eureka：基于master增加eureka功能
* ribbon：基于eureka分支增加Ribbon功能
* feign：基于ribbon分支增加Feign功能
* hystrix：基于feign分支增加Hystrix功能
* zuul：基于hystrix分支增加Zuul功能
* config：基于zuul分支增加Config功能
# 目录介绍
## microservice-com
微服务公共方法
## microservice-provider
服务提供者
### microservice-consumer
服务消费者
### microservice-eureka1
服务注册中心