INSERT INTO drugstore.employees (employee_id, employee_name, job_id, email, department_id, password)
VALUES ('672328094', '嘉然', 2, 'bilibili.com/BV1FX4y1g7u8', 2, 'Diana0307'),
       ('672353429', '贝拉', 2, 'bilibili.com/BV1oo4y1X7Ca', 1, 'Bella0717'),
       ('672346917', '向晚', 3, 'bilibili.com/BV1oo4y1X7Ca', 2, 'Ava'),
       ('351609538', '珈乐', 3, 'bilibili.com/BV1oo4y1X7Ca', 1, 'Carol1102'),
       ('672342685', '乃琳', 3, 'bilibili.com/BV1oo4y1X7Ca', 1, 'huoguo'),
       ('703007996', 'A-SOUL_Official', 1, 'bilibili.com/BV1vQ4y1Z7C2', null, DEFAULT);

INSERT INTO drugstore.drugs (drug_id, drug_name, manufacturer, price)
VALUES ('A14200015667', '雷贝拉唑钠肠溶片', '成都迪康药业有限公司', 27.00),
       ('S99402759931', '汤臣倍健褪黑素片', '广东汤臣倍健生物科技股份有限公司', 79.00),
       ('C12000000357', '感冒灵颗粒(999)', '华润三九医药股份有限公司', 18.90),
       ('B12201000028', '布洛芬缓释胶囊(芬必得)', '中美天津史克制药有限公司', 24.20),
       ('A99400468858', '蛋白粉(汤臣倍健)', '汤臣倍健股份有限公司', 289.00),
       ('B09000339168', '欧姆龙电子血压计HEM-7121', '欧姆龙(大连)有限公司', 208);

INSERT INTO drugstore.departments (department_id, department_name, address, manager_id)
VALUES (1, '乃贝珈药店', '枝江市枝江理工大学西生活区', '672353429'),
       (2, '嘉晚饭药店', '枝江市枝江理工大学东生活区', '672328094');