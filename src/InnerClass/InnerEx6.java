package InnerClass;

public class InnerEx6 {
	Object iv = new Object() {
		void method() {
			
		}
	};	//�͸�Ŭ����
	
	static Object cv = new Object() {
		void method() {
			
		}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method() {
				
			}
		};
	}
}
