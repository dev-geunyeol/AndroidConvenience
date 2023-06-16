# AndroidExample
### 안드로이드 예제 코드
<br>

:question: 특정 디렉토리만 다운받는 방법
```
git init
git remote add origin https://github.com/dev-geunyeol/AndroidConvenience.git
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
