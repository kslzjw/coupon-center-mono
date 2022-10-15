# coupon-center-mono
## coupon-center-mono是一个单体架构的优惠券平台

在顶层项目 coupon-center-mono之下有四个子模块，我先来分别解释下它们的功能：

	coupon-template-serv： 创建、查找、克隆、删除优惠券模板；
	coupon-calculation-serv：计算优惠后的订单价格、试算每个优惠券的优惠幅度；
	coupon-customer-serv：通过调用 template 和 calculation 服务，实现用户领取优惠券、模拟计算最优惠的券、删除优惠券、下订单等操作；

在每一个以“-serv”结尾的业务子模块中，我从内部分层的角度对其做了进一步拆分.以coupon-template-serv为例，它内部包含了三个子模块：

	coupon-template-api：存放公共 POJO 类或者对外接口的子模块；
	coupon-template-dao：存放数据库实体类和 Dao 层的子模块；
	coupon-template-impl：核心业务逻辑的实现层，对外提供 REST API。

### Tips
	把coupon-template-api作为一个单独的模块，这样做的好处是：当某个上游服务需要获取 coupon-template-serv 的接口参数时，只要导入轻量级的 coupon-template-api 模块，就能够获取接口中定义的 Request 和 Response 的类模板，不需要引入多余的依赖项（比如 Dao 层或者 Service 层）。这就是开闭原则的应用，它使各个模块间的职责和边界划分更加清晰，降低耦合的同时也更加利于依赖管理。
