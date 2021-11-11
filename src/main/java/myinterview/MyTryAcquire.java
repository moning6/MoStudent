package myinterview;

//目的：了解 公平锁 对比机制 以及可重入行的实现
//底层代码  C++分析

//还在试着 在哪看到源码

//public class MyTryAcquire {
//    protected final boolean tryAcquire(int acquires){
//        //当你想要获得锁的线程
//        final Thread current = Thread.currentThread();
//        //获取锁的状态
//        Thread.State c = current.currentThread().getState();
//        if ( c == 0){
//            if (!hasQueuedPredecessors() &&
//                compareAndSetState(0,acquires)){
//                setExclusiveOwnerThread(current);
//                return true;
//            }
//        }
//        else if ( current == getExclusiveOwnerThread()){
//            int nextc = c + acquires;
//            if (nextc < 0 )
//                throw new Error("Maxium lock count exceeded");
//            setState(nextc);
//            return true;
//        }
//        return false;
//    }
//}
//bug 全线爆红 难搞哦 hasQueuedPredecessors 这是底层的吧
