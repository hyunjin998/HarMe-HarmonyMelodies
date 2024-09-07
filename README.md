# HarMe(Harmony-Melodies) 👵🏻🎵
https://github.com/user-attachments/assets/ec7ac9de-3d87-4f96-bc89-a59ac0f62c24

<br><br>

## 🤔 기획 배경
- 음악이 우울증 해소에 긍정적 영향을 미친다는 연구를 바탕으로 노년층의 우울증 증가를 해결하기 위해 본 서비스를 기획<br>
- Google Cloud Platform, OpenAI, Suno AI를 활용하여 음성 인식, 가사 생성, 그림 생성, 노래 생성을 지원하는 서비스를 제공<br>
- 이를 통해 노년층의 정서적 안정, 사회적 연결, 인지 기능 향상, 자아실현을 도모하고자 함<br>
<br><br>

## 💡 주요 기능
<img src="https://github.com/user-attachments/assets/e897a9a1-d882-4e23-a57c-d7866e3c393b" width="100%"></img>
#### 프롬프트 입력이 어려운 노인세대에게 음성명령을 통해 쉽게 음악을 생성하고 공유하는 경험을 제공
- 사용자의 음성 명령어 받기
- 사용자의 음성 명령어 교정
- 요청에 맞는 가사 작성 (ChatGPT)
- 요청에 맞는 음원 생성 (Suno AI)
- 요청에 맞는 앨범커버 제작 (DALLE)
<br><br>

## 🎙️ 서비스 화면
### 1. 작곡 기능

<img src=https://github.com/user-attachments/assets/1686b56b-fbfe-4fd1-905e-caa9900c36ce width="360" height="840"></img>
<img src="/MakingImage.gif" width="360" height="840"></img>
<br>

<!--
<img src=https://github.com/user-attachments/assets/0f81ad00-4676-4d46-8e27-cf2ba20bd70e width="170" height="420"></img>
<img src=https://github.com/user-attachments/assets/8c44ac4e-d5cd-4e90-a1a3-bcbe221090ff width="160" height="420"></img>
<img src=https://github.com/user-attachments/assets/8a315e57-25e7-423f-be4c-c67029f0404c width="160" height="420"></img>
<img src=https://github.com/user-attachments/assets/c2c4bf2f-7799-4598-91f3-8809001b8fc0 width-="170" height="420"></img>
<img src=https://github.com/user-attachments/assets/b1605cae-7015-4627-adc0-188d0fbd344c width="170" height="420"></img>  -->

### 2. 앨범 만들기

<img src=https://github.com/user-attachments/assets/18168dba-fa6d-4d2e-87a2-6999a12dce64 width="360" height="840"></img>
<img src="/images/makeImage.gif" width="360" height="840"></img>
<br>

### 3. 기록 기능

<img src=https://github.com/user-attachments/assets/af1157b8-2670-4406-b410-2c97381ee5fe width="360" height="840"></img>
<img src=https://github.com/user-attachments/assets/40921391-281b-4ee2-bc2b-a89e0f131bf5 width="420" height="840"></img>
<br><br>

## 🚧 시스템 아키텍쳐

<img src="./images/Harme-SystemArchitecture.png">
<br><br>

## 🔗 설계 문서

### ERD

<img src="./images/Harme-erd.png">

### 🔗 [기능명세서](https://better-jumpsuit-1f8.notion.site/3eb7c54faee1405a9340949eeeacb4bb?pvs=4)

### 🔗 [Swagger](http://43.201.54.73:8081/swagger-ui/index.html)

<br><br>

## 🛠 기술 스택

| tech   | version                 |
| ------ | -------------------- |
| <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" /> | 17.0.9 <br>         |
| <img src="https://img.shields.io/badge/Springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" /> | 3.3.2 <br>         |
| <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white" /> | 8.0.34 <br>            |
| <img src="https://img.shields.io/badge/TypeScript-007ACC?style=for-the-badge&logo=typescript&logoColor=white" /> |  <br>            |
| <img src="https://img.shields.io/badge/Next.js-000?logo=nextdotjs&logoColor=fff&style=for-the-badge" /> |  <br> |
<br>


## 📂 파일 구조

<details  style="margin-left: 5px;">
<summary><b>BackEnd</b></summary>
<div>

```
📦harme
┣ 📂global
┃ ┣ 📂client
┃ ┃ ┗ 📜RestClientConfig
┃ ┣ 📂docs
┃ ┃ ┗ 📜SwaggerConfig
┃ ┣ 📂error
┃ ┃ ┣ 📂custom
┃ ┃ ┃ ┗ 📜RecordNotFoundException
┃ ┃ ┣ 📜ErrorCode
┃ ┃ ┗ 📜ErrorResponse
┃ ┣ 📂exception
┃ ┃ ┗ 📜GlobalExceptionHandler
┃ ┣ 📂s3
┃ ┃ ┣ 📜S3Config
┣ 📂image
┃ ┣ 📂controller
┃ ┃ ┗ 📜ImageController
┃ ┣ 📂dto
┃ ┃ ┣ 📜ImageRequestDto
┃ ┃ ┗ 📜ImageResponseDto
┃ ┣ 📂service
┃ ┃ ┗ 📜ImageController
┣ 📂music
┃ ┣ 📂controller
┃ ┃ ┣ 📜MusicController
┃ ┣ 📂dto
┃ ┃ ┣ 📜MainMusicResponseDto
┃ ┃ ┣ 📜MusicGenerateRequestDto
┃ ┃ ┣ 📜MusicGenerateResponseDto
┃ ┃ ┣ 📜MusicRequestDto
┃ ┃ ┣ 📜MusicResponseDto
┃ ┃ ┣ 📜Translate
┃ ┃ ┣ 📜TransRequestDto
┃ ┃ ┗ 📜TransResponseDto
┃ ┣ 📂entity
┃ ┃ ┗ 📜MusicEntity
┃ ┣ 📂repository
┃ ┃ ┗ 📜MusicsRepository
┃ ┣ 📂service
┃ ┃ ┗ 📜MusicService
┣ 📂mypage
┃ ┣ 📂controller
┃ ┃ ┗ 📜MypageController
┃ ┣ 📂dto
┃ ┃ ┣ 📜MypageRequestDto
┃ ┃ ┗ 📜MypageResponseDto
┃ ┣ 📂entity
┃ ┃ ┗ 📜PlayEntity
┃ ┣ 📂repository
┃ ┃ ┗ 📜MypageRepository
┃ ┣ 📂service
┃ ┃ ┗ 📜MypageService
┣ 📂record
┃ ┣ 📂controller
┃ ┃ ┗ 📜RecordController
┃ ┣ 📂dto
┃ ┃ ┣ 📜LatestRecordsAndMusicResponse
┃ ┃ ┣ 📜RecordDetailRequestDto
┃ ┃ ┣ 📜RecordDetailResponseDto
┃ ┃ ┣ 📜RecordMakingRequestDto
┃ ┃ ┣ 📜RecordRequestDto
┃ ┃ ┗ 📜RecordResponseDto
┃ ┣ 📂entity
┃ ┃ ┗ 📜RecordEntity
┃ ┣ 📂exception
┃ ┃ ┗ 📜RecordNotFoundException
┃ ┣ 📂repository
┃ ┃ ┗ 📜RecordRepository
┃ ┣ 📂service
┃ ┃ ┗ 📜RecordService
┣ 📂user
┃ ┣ 📂controller
┃ ┃ ┣ 📜UserController
┃ ┣ 📂dto
┃ ┃ ┣ 📜UserRequestDto
┃ ┃ ┗ 📜UserResponseDto
┃ ┣ 📂entity
┃ ┃ ┗ 📜UserEntity
┃ ┣ 📂repository
┃ ┃ ┗ 📜UserRepository
┃ ┣ 📂service
┃ ┃ ┗ 📜UserService
┗ 📜HarmeApplication
```

</div>
</details>

<br>
<details  style="margin-left: 5px;">
<summary><b>FrontEnd</b></summary>
<div>

```
📦allclear
┣ 📂public
┃ ┣ 📂chat-icons
┃ ┣ 📂create-cover-icons
┃ ┗ 📂player-icons
┣ 📂src
┃ ┣ 📂app
┃ ┣ 📂atoms
┃ ┣ 📂components
┃ ┣ 📂hooks
┃ ┣ 📂libs
┃ ┣ 📂mocks
┃ ┣ 📂types
┣ 📜.eslintrc.cjs
┣ 📜.gitignore
┣ 📜.prettierrc
┣ 📜components.json
┣ 📜next.config.mjs
┣ 📜package.json
┣ 📜pnpm-lock.yaml
┣ 📜postcss.config.mjs
┣ 📜README.md
┣ 📜tailwind.config.js
┗ 📜tsconfig.json
```

</div>
</details>
<br>

## 🐰 팀 구성

| 이름   | 역할                 |
| ------ | -------------------- |
| 김민태 | Leader, AI <br>    |
| 석지원 | UI/UX <br>         |
| 오승태 | FE <br>            |
| 김현진 | BE <br>            |
| 이대영 | BE, AI, Infra <br> |

<br>
