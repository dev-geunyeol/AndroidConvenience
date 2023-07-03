# AndroidExample
### 안드로이드 예제 코드
<br>

:question: 특정 디렉토리만 다운받는 방법
```
git init
git remote add origin https://github.com/dev-geunyeol/AndroidExample.git
git config core.sparsecheckout true
echo [디렉토리명/*] >> .git/info/sparse-checkout
git pull origin main
```

<br>
:white_check_mark: Example Description
<br><br>

| 디렉토리 명 | 설명 |
|------|---|
| ViewAndDataBinding | viewBinding, dataBinding을 이용한 count up down |
| FragmentUse | Activity에서 Fragment 사용 및 전환 |
| AlertDialogUse | AlertDialog 사용 및 종류(체크 & 라디오 dialog) |
| FragmentDialog | DialogFragment 기본 사용법 |
| DateConvert | String to Date Convert 날짜로 변환하기 |
| WindowSizeAndDpi | 화면 사이즈 및 Dpi 구하기 |
| LoopTimer | Handler 대신 사용해보는 지속 및 반복 작업 |
