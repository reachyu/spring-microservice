/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/7/28 16:43:59                           */
/*==============================================================*/


drop table if exists tb_order;

/*==============================================================*/
/* Table: tb_order                                              */
/*==============================================================*/
create table tb_order
(
   orderId              varchar(20) not null,
   goodsId              varchar(20),
   payment              smallint comment '1:支付宝,2:微信,3:信用卡,4:银行卡,5:到付',
   orderTime            timestamp,
   orderAmount          numeric,
   payAmount            numeric,
   orderStatus          smallint comment '1:待支付,2:待发货,3:运输中,4:已签收,5:已支付',
   orderDesc            varchar(255) comment '订单描述',
   primary key (orderId)
);

alter table tb_order comment '订单表';

