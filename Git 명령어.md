VSC(VS CODE) OR Intellij에서 

폴더 오픈



에디터 터미널에서

git init



단일 파일 업로드

git add 파일명.파일확장자

git commit -m '메세지'



여러 파일 업로드

git add 파일명1.파일확장자1 파일명2.파일확장자2



모든 파일 업로드

git add .

------

상태창 열기

git status

명령어는 현재 작업 디렉토리의 상태를 확인

어떤 파일들이 변경되었는지, staging area에는 어떤 파일들이 준비되어 있는지 등



git diff

최근 commit이랑 현재파일 차이점 알려줌



git log --all --oneline

Git 저장소의 모든 커밋(commit)을 간결하게 한 줄씩 보여주는 명령어



git log --graph --oneline --all

branch 와 commit 내역을 한 눈에 그래프로 보고 싶으면 이거 입력



git switch main 

Git 저장소에서 `main`이라는 이름의 브랜치로 현재 작업 영역을 전환하는 명령



git merge 브랜치명

git merge 브랜치명 명령어는 Git에서 두 개의 브랜치를 합치는 명령어

예를 들어, main 브랜치에서 작업하고 있는데, feature 브랜치에 개발한 기능을 main 브랜치에 합치고 싶다면 다음과 같이 명령을 실행합니다.

------

git restore 파일명

단일 파일을 최근 커밋 상태로 되돌림



git restore --source 커밋아이디 파일명

특정 commit 시점으로 파일 복구



git restore --staged 파일명

staging area에서 파일을 작업 디렉토리로 되돌림

staging 취소하는거 ㅇ





git revert 커밋아이디1 커밋아이디2

commit 단위로 복구



git revert HEAD

최근 commit 취소



git reset --hard 커밋아이디

커밋아이디 시점으로 모든걸 되돌림









