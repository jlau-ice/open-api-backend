-- 创建库
create database if not exists open_api;

-- 切换库
use open_api;

-- 用户表
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    user_name     varchar(256)                           null comment '用户昵称',
    user_account  varchar(256)                           not null comment '账号',
    user_avatar   varchar(1024)                          null comment '用户头像',
    gender       tinyint                                null comment '性别',
    user_role     varchar(256) default 'user'            not null comment '用户角色：user / admin',
    user_password varchar(512)                           not null comment '密码',
    create_time   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete     tinyint      default 0                 not null comment '是否删除',
    constraint uni_user_account
        unique (user_account)
) comment '用户';

-- 帖子表
create table if not exists post
(
    id            bigint auto_increment comment 'id' primary key,
    age           int comment '年龄',
    gender        tinyint  default 0                 not null comment '性别（0-男, 1-女）',
    education     varchar(512)                       null comment '学历',
    place         varchar(512)                       null comment '地点',
    job           varchar(512)                       null comment '职业',
    contact       varchar(512)                       null comment '联系方式',
    love_exp       varchar(512)                       null comment '感情经历',
    content       text                               null comment '内容（个人介绍）',
    photo         varchar(1024)                      null comment '照片地址',
    review_status  int      default 0                 not null comment '状态（0-待审核, 1-通过, 2-拒绝）',
    review_message varchar(512)                       null comment '审核信息',
    view_num       int                                not null default 0 comment '浏览数',
    thumb_num      int                                not null default 0 comment '点赞数',
    user_id        bigint                             not null comment '创建用户 id',
    create_time    datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete      tinyint  default 0                 not null comment '是否删除'
) comment '帖子';


-- 接口信息表
-- auto-generated definition
create table interface_info
(
    id              bigint       not null comment '主键，用户id'
        primary key,
    name            varchar(255) not null comment '名称',
    description     varchar(255) null comment '描述',
    url             varchar(512) not null comment '接口地址',
    request_header  text         null comment '请求头',
    response_header text         null comment '响应头',
    status          int          not null comment '接口状态(0-关闭，1-开启)',
    method          varchar(255) not null comment '请求类型',
    user_id         bigint       not null comment '创建人',
    create_time     datetime     not null on update CURRENT_TIMESTAMP comment '创建时间',
    update_time     datetime     not null on update CURRENT_TIMESTAMP comment '更新时间',
    is_delete       tinyint      not null comment '是否删除(0-未删除，1-已删除)'
);

