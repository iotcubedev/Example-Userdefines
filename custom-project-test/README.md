### 기본설명
* 사내에서 생성한 예제 프로젝트로 테스트하는 폴더입니다.
* 빠른 테스트를 원하는 경우. 검출 결과의 형태를 확인하고 싶은 경우.

### 테스트 방법 

#### A. 사용자정의요소 등록 
1. ./components/ 폴더 아래의 각 파일들을 'GNB/조직정책/사용자정의 구성관리/컴포넌트' 페이지에 각각 등록합니다.
2. ./function 폴더 아래의 각 함수폴더별로 'GNB/조직정책/사용자정의 구성관리/취약점' 페이지에 각각 등록합니다.
* function.txt: 사용자정의취약점 등록화면에서 "취약함수" 영역에 등록할 함수코드
* patch.txt: 사용자정의취약점 등록화면에서 "패치등록" 영역에 등록할 패치코드


#### B. 대상 프로젝트 분석하기  
1. 아래 프로젝트를 분석하면 A에서 등록한 사용자정의요소들이 검출됩니다.

* https://github.com/iotcubedev/Java-Project-with-Userdefines
* https://github.com/iotcubedev/Java-Project-Using-ES
