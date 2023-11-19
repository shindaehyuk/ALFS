# ALFS (ALllergy Free Scouter)

![Untitled](exec/Readme-asset/Untitled.jpeg)

# 알러지 정보 기반의 온라인 식료품 쇼핑 플랫폼

### 배포 주소

> 📌 https://k9c204.p.ssafy.io

# 📌기술 스택

### Back-End

<div>
  <img src="https://img.shields.io/badge/Java [11.0.15]-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring Boot [2.7.17]-6DB33F?style=for-the-badge&logo=Spring Boot&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring Batch [5.0.3]-6DB33F?style=for-the-badge&logo=Spring Batch&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring Scheduler-6DB33F?style=for-the-badge&logo=Spring Scheduler&logoColor=white" />
  <img src="https://img.shields.io/badge/Gradle [8.2.1]-02303A?style=for-the-badge&logo=gradle&logoColor=white" />
  
</div>

### Front-End

<div>
  <img src="https://img.shields.io/badge/typescript [5.2]-3178C6?style=for-the-badge&logo=typescript&logoColor=white">
  <img src="https://img.shields.io/badge/Next.js [13.5.6]-000000?style=for-the-badge&logo=next.js&logoColor=white">
  <img src="https://img.shields.io/badge/chakra ui [2.1.5]-319795?style=for-the-badge&logo=chakraui&logoColor=white">
  <img src="https://img.shields.io/badge/node.js [18.16.1]-339933?style=for-the-badge&logo=Node.js&logoColor=white">
  <img src="https://img.shields.io/badge/webpack-8DD6F9?style=for-the-badge&logo=webpack&logoColor=black">
</div>

### Database

<div>
  <img src="https://img.shields.io/badge/mysql docker image [8.0.29]-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
  <img src="https://img.shields.io/badge/redis [7.2.3]-DC382D?style=for-the-badge&logo=redis&logoColor=white">
</div>

### Server

<div>
  <img src="https://img.shields.io/badge/nginx-009639?style=for-the-badge&logo=nginx&logoColor=white">
  <img src="https://img.shields.io/badge/AWS ec2-FF9900?style=for-the-badge&logo=amazonec2&logoColor=white">
  <img src="https://img.shields.io/badge/AWS s3-569A31?style=for-the-badge&logo=amazons3&logoColor=white">
  <img src="https://img.shields.io/badge/ubuntu [20.04 LTS]-E95420?style=for-the-badge&logo=ubuntu&logoColor=white">
  
</div>

### VCS

<div>
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white" />
  <img src="https://img.shields.io/badge/GitLab-FC6D26?style=for-the-badge&logo=gitlab&logoColor=white" />
</div>

### IDE

<div>
  <img src="https://img.shields.io/badge/Visual Studio Code [1.80.1]-007ACC?style=for-the-badge&logo=visualstudiocode&logoColor=white" />
  <img src="https://img.shields.io/badge/IntelliJ IDEA [2023.1.4]-000000?style=for-the-badge&logo=intellijidea&logoColor=white" />
</div>

### CI/CD

<div>
  <img src="https://img.shields.io/badge/Docker [24.0.4]-2496ED?style=for-the-badge&logo=docker&logoColor=white">
  <img src="https://img.shields.io/badge/Docker COMPOSE [2.23.0]-2496ED?style=for-the-badge&logo=DOCKER&logoColor=white">
  <img src="https://img.shields.io/badge/jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white">
</div>

### Environment

<div>
  <img src="https://img.shields.io/badge/jira-0052CC?style=for-the-badge&logo=jira&logoColor=white">
  <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white">
  <img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">
  <img src="https://img.shields.io/badge/figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white">
  <img src="https://img.shields.io/badge/Mattermost [5.3.1]-0058CC?style=for-the-badge&logo=mattermost&logoColor=white" />
  <img src="https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" />
  <img src="https://img.shields.io/badge/termius [8.0.2]-000000?style=for-the-badge&logo=termius&logoColor=white" />
</div>

# 📌서비스 소개

## 서비스 설명

### 개요

- **타겟층**
    <aside>
    💡 매번 원재료를 확인하고 구매해야하는 알러지 환자들
    
    </aside>

- **목표**
    <aside>
    💡 본인의 알러지를 등록하면 알러지가 **목록**에서부터 필터링 된 서비스를 이용할 수 있는 알러지 환자들에게 새로운 패러다임의 식품 쇼핑을 제공
    
    </aside>

# 📌기획 배경

- 알러지를 보유한 경우에 두드러기나 습진 같은 피부 증상, 설사나 구토 등의 소화기 증상 그리고 호흡곤란, 발열 등의 증상이 나타날 수 있는데, 심한 경우 의식을 잃는 아나필락시스 쇼크 증상이 나타나 생명을 위협한다.
- 1인가구의 등장과 비대면의 시대로 온라인 식료품 구매가 활발해지고있다. 알러지 환자들은 어김없이 식재료를 구매하는 것에 불편함을 온라인 식품 쇼핑에서도 겪고 있다.

# 📌기능 소개

## 주요 기능

⭐ **알러지 필터링**

- 필터를 적용할 때, 사용자가 회원가입에서 작성한 알러지 목록을 가져와서 적용
- 추가적으로 기피하는 식품도 적용 가능. 알러지 필터로 상품에 포함된 알러지 유발 원재료, 제조시설에서 함유될 수 있는 알러지 유발 원재료, 기피 원재료를 파악할 수 있음

⭐ **대체 식품 추천**

- 알러지를 유발하는 원재료에 해당하는 대체 식품 목록을 확인

⭐ **선착순 특가 및 양자택일 이벤트**

- 사용자의 기피식품을 선택하는 이벤트로, 실시간 나의 입력횟수 처리와 비율 반환

⭐ **관리자 상품 등록**

- 관리자가 상품 정보를 입력할 때 이미지를 업로드하여 OCR 기능을 통해 원재료명을 추출
- 상품 이미지는 AWS S3를 통해 이미지 url을 받고 상품에 해당하는 이미지 url을 DB에 저장

⭐ **장바구니 결제**

- 사용자는 토스 페이 API를 사용하여 결제가능
- 주문내역에서 결제내역 확인가능

# 📌프로젝트 진행 및 산출물

### 프로젝트 개발 기간

`2023.10.09.` ~ `2023.11.17.` (6주)

### 프로젝트 산출물

### 1. Figma

![20231117_105748.png](exec/Readme-asset/20231117_105748.png)

### 2. ERD

![alfs.png](exec/Readme-asset/alfs.png)

### 프로젝트 구조

**Front-End (Next.js)**

```
📦frontend
├── 📁public
└── 📁src
    ├── 📁_assets
    │   ├── 📁data
    │   └── 📁img
    ├── 📁_components
    │   ├── 📁animate
    │   ├── 📁banner
    │   ├── 📁bigsale
    │   ├── 📁card
    │   ├── 📁cardItem
    │   ├── 📁choiceAllergy
    │   │   └── 📁image
    │   ├── 📁common
    │   ├── 📁event
    │   ├── 📁footer
    │   │   └── 📁_image
    │   ├── 📁header
    │   ├── 📁loading
    │   ├── 📁location
    │   ├── 📁modal
    │   ├── 📁needLogin
    │   └── 📁(pages)
    │       ├── 📁alt
    │       ├── 📁bigsale
    │       ├── 📁board
    │       │   ├── 📁all
    │       │   └── 📁register
    │       ├── 📁cart
    │       │   └── 📁_components
    │       ├── 📁category
    │       │   └── 📁[category]
    │       ├── 📁detail
    │       │   └── 📁[data]
    │       ├── 📁event
    │       ├── 📁list
    │       ├── 📁login
    │       │   └── 📁supervisor
    │       ├── 📁mypage
    │       │   ├── 📁allergy
    │       │   │   └── 📁_components
    │       │   ├── 📁home
    │       │   │   └── 📁_components
    │       │   ├── 📁info
    │       │   │   └── 📁_components
    │       │   └── 📁order
    │       ├── 📁search
    │       ├── 📁signup
    │       └── 📁supervisor
    │           ├── 📁board
    │           ├── 📁product
    │           ├── 📁register
    │           │   └── 📁_components
    │           ├── 📁special-all
    │           └── 📁special-register
    ├── 📁api
    │   ├── 📁alt
    │   ├── 📁bigsalelist
    │   ├── 📁board
    │   ├── 📁cart
    │   ├── 📁categorizedlist
    │   ├── 📁detail
    │   ├── 📁event
    │   ├── 📁list
    │   ├── 📁special
    │   ├── 📁supervisor
    │   └── 📁user
    └── 📁fonts
```

**Back-End (Spring Boot)**

```
📦backend
├── 📁gradle
│   └── 📁wrapper
└── 📁src
    ├── 📁main
    │   ├── 📁java
    │   │   └── 📁com
    │   │       └── 📁world
    │   │           └── 📁alfs
    │   │               ├── 📁common
    │   │               │   └── 📁exception
    │   │               ├── 📁config
    │   │               │   └── 📁batch
    │   │               │       └── 📁special
    │   │               ├── 📁controller
    │   │               │   ├── 📁address
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁allergy
    │   │               │   ├── 📁alternative
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁aws_s3
    │   │               │   ├── 📁basket
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁board
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁event
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁event_batch
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁ingredient
    │   │               │   │   └── 📁request
    │   │               │   ├── 📁manufacturing_allergy
    │   │               │   │   └── 📁request
    │   │               │   ├── 📁member
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁member_allergy
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁product
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁product_ingredient
    │   │               │   ├── 📁special
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               │   ├── 📁supervisor
    │   │               │   │   ├── 📁request
    │   │               │   │   └── 📁response
    │   │               ├── 📁domain
    │   │               │   ├── 📁address
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁allergy
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁alternative
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁basket
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁board
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁event
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁ingredient
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁ingredient_allergy
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁manufacturing_allergy
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁member
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁member_allergy
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁product
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁product_ingredient
    │   │               │   │   └── 📁repository
    │   │               │   ├── 📁special
    │   │               │   │   └── 📁repository
    │   │               │   └── 📁supervisor
    │   │               │       └── 📁repository
    │   │               ├── 📁security
    │   │               └── 📁service
    │   │                   ├── 📁address
    │   │                   │   └── 📁dto
    │   │                   ├── 📁allergy
    │   │                   ├── 📁alternative
    │   │                   │   └── 📁dto
    │   │                   ├── 📁aws_s3
    │   │                   ├── 📁basket
    │   │                   │   └── 📁dto
    │   │                   ├── 📁board
    │   │                   │   └── 📁dto
    │   │                   ├── 📁event
    │   │                   │   └── 📁dto
    │   │                   ├── 📁ingredient
    │   │                   │   └── 📁dto
    │   │                   ├── 📁ingredient_allergy
    │   │                   ├── 📁manufacturing_allergy
    │   │                   │   └── 📁dto
    │   │                   ├── 📁member
    │   │                   │   └── 📁dto
    │   │                   ├── 📁member_allergy
    │   │                   │   └── 📁dto
    │   │                   ├── 📁product
    │   │                   │   └── 📁dto
    │   │                   ├── 📁product_img
    │   │                   ├── 📁product_ingredient
    │   │                   ├── 📁special
    │   │                   │   └── 📁dto
    │   │                   │── 📁supervisor
    │   │                   │   └── 📁dto
    │   │                   └── 📁wining
    │   └── 📁resources
    └── 📁test
        └── 📁java
            └── 📁com
                └── 📁world
                    └── 📁alfs
                        ├── 📁config
                        │   └── 📁batch
                        ├── 📁controller
                        │   ├── 📁product
                        │   └── 📁supervisor
                        ├── 📁domain
                        │   ├── 📁product
                        │   │   └── 📁repository
                        │   ├── 📁product_ingredient
                        │   │   └── 📁repository
                        │   ├── 📁special
                        │   └── 📁supervisor
                        │       └── 📁repository
                        └── 📁service
                            ├── 📁product
                            ├── 📁product_ingredient
                            ├── 📁special
                            └── 📁supervisor
```

# 📌개발 멤버

## 개발팀 소개

| 연주원                                  | 김수진                                | 손효민                                        | 신대혁               | 안종상     | 홍주영    |
| --------------------------------------- | ------------------------------------- | --------------------------------------------- | -------------------- | ---------- | --------- |
| [joo1yeon](https://github.com/joo1yeon) | [soo0300](https://github.com/soo0300) | [SonHyoMin00](https://github.com/SonHyoMin00) |                      |            |           |
| 팀장, Back-end, Infra, 기획 발표        | Back-end                              | Back-end                                      | Front-end, 최종 발표 | Full-stack | Front-end |
