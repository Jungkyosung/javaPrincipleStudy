package javaPrinciple;

public class JavaMemoryStructure {

	public static void main(String[] args) {
		System.out.println("Hello!");
		
//현재 클래스의 자바(JDK, JRE, JVM)의 메모리 사용을 알아 보자.
		
//자바에는 코드 실행 영역과
//데이터 저장 영역으로 나뉘어서 메모리를 사용한다.
//(모든 프로그래밍 언어의 공통된 방식임) 
//어셈블리어를 공부하면 컴퓨터의 작동 원리를 이해하는데 도움이 된다.
//코드 실행 영역은 어셈블리어를 공부하면서 확인해보고 자바에선 데이터 저장 영역만 보자.
//자바의 데이터 저장 영역의 구조는 Static(영역)/Stack(영역)/Heap(영역)으로 구분된다.
//
//그럼 자바는 데이터 저장 영역을 어떻게 사용하는지 보자.
//JRE(Java Runtime Environment)는 main()을 찾는다.
//자바가 main메소드의 존재를 확인하면 -> JVM(java virtual machine)을 부팅한다.
//JVM은 가장 먼저 java.lang패키지를 Static영역에 올린다.
//JVM은 다음으로 개발자가 작성한 모든 클래스들과 import패키지를 Static 영역에 올린다.

//모든 전처리 과정을 끝낸 후, main()메소드의 Stack Frame을 Stack영역에 올린다.
//여는 중괄호 "{"를 만날 때 마다 스택 프레임이 하나씩 스택영역에 할당된다.
//(클래스 정의하는 중괄호는 제외)
//main()의 인자인 args를 main() 스택 프레임의 맨 밑에 할당한다.

//여기까지 작업 후 첫 명령문을 실행한다.
//코드 실행 영역은 별도로 있다보니 별 다른 메모리 지정 없이 마무리 된다.		
		
	}

}
