总结：
    1.输入输入hashNext和sc.nextInt使用的区别
待办:
    0101

模版代码：
-- 1.执行时间
long start=System.currentTimeMillis();
long end= System.currentTimeMillis();
System.out.println("本次执行程序所消耗的时间："+(end-start)+"ms");
-- 2.输入
int []arr = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();

不用再刷的题：
1101 1102 1103 1104 1105 
0102 0103 0104 0105 
