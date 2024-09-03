1. 使用Java内置接口
2. 观察者接口 & 通知类接口     java.util.Observer & java.util.Observable
3. Boss继承Observable类, 当addObserver()添加观察者后, 他在setAction()这样工作: 调用setChanged()后, 标记状态已改变, 然后调用notifyObservers()通知观察者
- addObserver           加观察者
- deleteObserver        减观察者
- notifyObservers       通知观察者