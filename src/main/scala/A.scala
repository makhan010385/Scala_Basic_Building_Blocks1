class A {
  var numA: Int = 0;

  def setA(n: Int) {
    numA = n;
  }

  def printA() {
    printf("numA: %d\n", numA);
  }
}
class B extends A {
  var numB: Int = 0;

  def setB(n: Int) {
    numB = n;
  }

  def printB() {
    printf("numB: %d\n", numB);
  }
}
class C extends B {
  var numC: Int = 0;

  def setC(n: Int) {
    numC = n;
  }

  def printC() {
    printf("numC: %d\n", numC);
  }
}
class D extends A {
  var numD: Int = 0;

  def setD(n: Int) {
    numD = n;
  }

  def printD() {
    printf("numD: %d\n", numD);
  }
}
object  hybrid_inheritance
{
  def main(args: Array[String]): Unit = {
    var obj1 = new C();
    var obj2 = new D();

    obj1.setA(10);
    obj1.setB(20);
    obj1.setC(30);

    obj1.printA();
    obj1.printB();
    obj1.printC();

    obj2.setA(40);
    obj2.setD(50);

    obj2.printA();
    obj2.printD();
  }
}