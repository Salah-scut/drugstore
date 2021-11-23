# drugstore
A drugstore management system for the lesson



# drugstore

A drugstore management system for the lesson





# 1	需求分析

### 用户

#### 1	系统管理员

权限：

1. 增加、修改、删除药店管理员、店员



#### 2	药店管理员

1. 增加、修改、删除药品



#### 3	销售员

1. 输入药名、厂家、编号查找药品



### 表

#### 员工表（employees）

|         字段名         |  类型   | 长度 | 默认值 | 是否允许为空 | KEY  |
| :--------------------: | :-----: | :--: | :----: | :----------: | :--: |
|  员工编号 employee_id  | varchar |  9   |   \    |      否      | PRI  |
| 员工姓名 employee_name | varchar |  20  |   \    |      否      |      |
|      职务 job_id       |   int   |  \   |   3    |      否      |      |
|     邮箱地址 email     | varchar |  30  |   \    |      是      |      |
|     密码 password      | varchar |  30  |  123   |      否      |      |
| 所属门店 department_id |   int   |  \   |   \    |      是      |      |
|                        |         |      |        |              |      |



#### 门店表 （stores）

|          字段名          |  类型   | 长度 | 默认值 | 是否允许为空 |        KEY        |
| :----------------------: | :-----: | :--: | :----: | :----------: | :---------------: |
|  门店编号 department_id  |   int   |  \   |   \    |      否      |        PRI        |
|  门店名 department_name  |   var   |  30  |   \    |      否      |                   |
|  门店地址 manufacturer   | varchar |  50  |   \    |      否      |                   |
| 店长员工编号 employee_id | varchar |  9   |   \    |      否      | foreign employees |
|                          |         |      |        |              |                   |



#### 药品表（drugs）

|        字段名         |  类型   | 长度 | 默认值 | 是否允许为空 | KEY  |
| :-------------------: | :-----: | :--: | :----: | :----------: | :--: |
|   药品编号 drug_id    | varchar |  30  |   \    |      否      | PRI  |
|   药品名 drug_name    | varchar |  30  |   \    |      否      |      |
| 生产单位 manufacturer | varchar |  50  |   \    |      是      |      |
|      价格 price       |  float  |  \   |   \    |      否      |      |
|                       |         |      |        |              |      |



#### 药品-门店表（drugs_stores）

|         字段名         | 类型 | 长度 | 默认值 | 是否允许为空 | KEY  |
| :--------------------: | :--: | :--: | :----: | :----------: | :--: |
|    药品编号 drug_id    |      |      |        |              |      |
| 门店编号 department_id |      |      |        |              |      |
|                        |      |      |        |              |      |
|                        |      |      |        |              |      |
|                        |      |      |        |              |      |





### E-R图





### UML





# 2	数据库创建



```sql

```



