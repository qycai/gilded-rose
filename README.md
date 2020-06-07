#说明
该作业参考网上课程后完成：https://space.bilibili.com/238186529/video?keyword=GildedRose  
对TDD的熟悉程度如果满分是5分，我给自己1.5分

#Tasking:
1.常规商品

given：没过保，价值>0；when：按天更新；then：保质期-1，价值-1

given：没过保，价值=0；when：按天更新；then：保质期-1，价值=0

given：过保，价值>1；when：按天更新；then：保质期-1，价值-2

given：过保，价值=1；when：按天更新；then：保质期-1，价值=0


2.后台门票

Given：10天以上，价值<50；when：按天更新；then：保质期-1，价值+1

Given：10天以上，价值=50；when：按天更新；then：保质期-1，价值=50

Given：5～10天，价值<49；when：按天更新；then：保质期-1，价值+2

Given：5～10天，价值=49；when：按天更新；then：保质期-1，价值=50

Given：5天以内，价值<48；when：按天更新；then：保质期-1，价值+3

Given：5天以内，价值=48；when：按天更新；then：保质期-1，价值=50

Given：过保；when：按天更新；then：保质期-1，价值=0
