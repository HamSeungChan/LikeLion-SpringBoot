<h2>1</h2>

- 요청 :  <br>http://localhost:8080/member/login?username=user1&password=1234 
- 응답 : <br>{<br>"resultCode": "S-1", <br>
  "msg": "user1 님 환영합니다."<br>
}<br><br>
- 요청 :  <br>http://localhost:8080/member/login?username=user1&password=12345
- 응답 : <br>{<br>"resultCode": "F-1", <br>
  "msg": "비밀번호가 일치하지 않습니다."<br>
  }<br><br>
- 요청 :  <br>http://localhost:8080/member/login?username=user2&password=1234
- 응답 : "resultCode": "F-2", <br>
  "msg": "user2(은)는 존재하지 않는 회원입니다."<br>
  }<br><br>

<h2>2</h2>

- 회원 리스트 추가
user1 / 1234 <br>
abc / 12345<br>
test / 12346<br>
love / 12347<br>
like / 12348<br>
/ 12349<br>
thanks / 123410<br>
hello / 123411<br>
good / 123412<br>
peace / 123413<br>
- 요청 :  <br>http://localhost:8080/member/login?username=user1&password=1234
- 응답 : <br>{<br>"resultCode": "S-1", <br>
  "msg": "user1 님 환영합니다."<br>
<h2>3</h1>
- 쿠키를 이용해서 로그인 상태 구현
- 요청 :  <br>http://localhost:8080/member/me
- 응답 : <br>{<br>"resultCode": "F-1", <br>
  "msg": "로그인 후 이용해주세요."<br>
<br>
- 요청 :  <br>http://localhost:8080/member/login?username=giving&password=12349
- 응답 : <br>{<br>"resultCode": "S-1", <br>
  "msg": "giving 님 환영합니다."<br>
<br>

- 요청 :  <br>http://localhost:8080/member/me
- 응답 : <br>{<br>"resultCode": "S-1", <br>
  "msg": "당신의 username(은)는 giving 입니다."<br>
- <br>