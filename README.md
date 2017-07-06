# Getting Started Travis For Java!
[![Build Status](https://travis-ci.org/dezang/gs-travis-java.svg?branch=master)](https://travis-ci.org/dezang/gs-travis-java)

이 글을 읽기 전에... 작성이 잘 되어있는 [트라비스 공식 가이드 문서](https://docs.travis-ci.com/)를 읽어보자. 좀 많긴하다. ~~ 그래서 나도 다 못 읽음~~

* 트라비스 자바 샘플 프로젝트...
* 열심히 업데이트 할께요.
* 배포까지를 목표로 합니다.

## 보안
소스에 중요한 비밀키나 패스워드가 들어가있으면 안되는 법. 트라비스에서는 두 가지 방법으로 중요한 정보가 노출되는 것을 방지할 수 있다.

### Environment Variables Setting
- https://renzo.lucioni.xyz/s3-deployment-with-travis/
- https://docs.travis-ci.com/user/environment-variables/

### Encryption keys
- http://make.stanleygeorge.com/setup-travis-ci.html

> This set of encryption keys will work ONLY on your repository. If someone forks your repository, then these keys will not work for them. The encrypted keys on the new repository will be different. This is good since you do not have to worry about someone forking your repository and overwriting the files in your S3 bucket.More detais on travis encryption keys can be found [here](https://docs.travis-ci.com/user/encryption-keys/).

여기서 내가 했던 한가지 삽집은 암호화된 키를 환경변수에 등록해서 사용하려 했던 것인데 ~~오직 내 레포에서만 동작하는지 몰랐다..~~ 제대로 동작하지 않았다.

## 배포
bf2555e3f4d4424bd7651a94c942fcd0903c2ec8 커밋에서 성공! 계속해서 트라비스와 코드디플로이 스크립트를 개선해야합니닷.

# 참고자료
- [스프링부트 그래들 플러그인](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-gradle-plugin.html)
