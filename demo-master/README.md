# 项目清单
完整项目清单包含如下<br>
1 客户端(uni-client)<br>
2 服务端(oujili-server)<br>
3 后台管理端(oujili-manage)<br>
# 项目结构
## 客户端
```
platform
|--api api接口请求
|--components 公共组件
|--pages tab页面
|--request restful接口请求封装
|--static 静态资源
|--subpackages 分包页面
|--uni_modules 引用组件包
|--utils 工具包
|--......
```
## 服务端
```
platform
|--authority 权限认证
|--common 公共工具类
|--controller 控制层
|--dao 数据访问层 
|--entity 实体类
|--schedules 定时器
|--service 业务层
|--......
```
## 后台管理端
```
platform
|--mock 公共相关js
|--public 静态资源
|--src 核心业务
|--......
```
# 技术架构
## 客户端
开发框架 uniapp<br>
客户端使用uniapp开发，一次开发可垮三端平台，目前支持发布到微信小程序,手机APP（安卓和IOS）,H5端等。
## 服务端
开发语言： java<br>
开发框架： springboot,spring cloud alibaba 两种版本，设计时按微服务设计开发，鉴于微服务的复杂性，为降低维护成本，改造了一个单体springboot版本，功能完全一样，可根据自己需求选择合适的版本<br>
数据库：mysql<br>
中间件：redis,nginx<br>
文件存储:  minio<br>
支付：微信支付<br>
其他第三方sdk:高德定位，腾讯定位
## 即时通讯IM
项目中聊天im未使用第三方插件，由自己实现，减少预算成本和依赖，im系统通过netty+websocket+redis 实现，理论上单体可同时超过百万人数在线，可集群部署，连接稳定，消息通过心跳和应答机制，保证每条消息可达性，即时通讯系统已历经多个其他项目生产检验和迭代，已具备商用的稳定和条件。
## 后台管理端
开发框架： vue
# 功能模块
## 客户端
- 用户资料推荐
- 用户匹配
- 在线聊天IM
- 个人中心
- 好友列表
- 社区朋友圈
- 好友动态列表
- 评论点赞互动
- 消息通知
- 我喜欢和喜欢我列表
- 学历认证
- 实名认证
- 修改个人资料
- 金币充值
- 微信好友 朋友圈分享
- 注销账户
- 注册
-  ......
## 后台管理端
- 资料审核
- 学历审核
- 实名审核
- 前台用户管理
- 用户统计
- ......

# 页面展示
## 客户端
![image](https://www.wxmblog.com/upload/2024/01/image.png)

![image-1704095985738](https://www.wxmblog.com/upload/2024/01/image-1704095985738.png)

![image-1720543710239](https://www.wxmblog.com/upload/2024/07/image-1720543710239.png)

![image-1720543768089](https://www.wxmblog.com/upload/2024/07/image-1720543768089.png)

![image-1704096286155](https://www.wxmblog.com/upload/2024/01/image-1704096286155.png)

![image-1704096379510](https://www.wxmblog.com/upload/2024/01/image-1704096379510.png)

![image-1704096488039](https://www.wxmblog.com/upload/2024/01/image-1704096488039.png)

![image-1704096557001](https://www.wxmblog.com/upload/2024/01/image-1704096557001.png)

![image-1704096901008](https://www.wxmblog.com/upload/2024/01/image-1704096901008.png)

![image-1704096851604](https://www.wxmblog.com/upload/2024/01/image-1704096851604.png)

![image-1704096994556](https://www.wxmblog.com/upload/2024/01/image-1704096994556.png)

![image-1704097048206](https://www.wxmblog.com/upload/2024/01/image-1704097048206.png)

![image-1704097967350](https://www.wxmblog.com/upload/2024/01/image-1704097967350.png)

![image-1720543671736](https://www.wxmblog.com/upload/2024/07/image-1720543671736.png)

![image-1704097243586](https://www.wxmblog.com/upload/2024/01/image-1704097243586.png)

![image-1704097666584](https://www.wxmblog.com/upload/2024/01/image-1704097666584.png)

## 后台管理端
![image-1703080008972](https://www.wxmblog.com/upload/2023/12/image-1703080008972.png)

![image-1703080026969](https://www.wxmblog.com/upload/2023/12/image-1703080026969.png)

![image-1703080054976](https://www.wxmblog.com/upload/2023/12/image-1703080054976.png)

![image-1703080089429](https://www.wxmblog.com/upload/2023/12/image-1703080089429.png)

![image-1703080104100](https://www.wxmblog.com/upload/2023/12/image-1703080104100.png)
