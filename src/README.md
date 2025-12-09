# Calculator Project (Maven-д Суурилсан Java Төсөл)

Энэ төсөл нь энгийн тооцоолуурын функцүүдийг агуулсан Java/Maven төсөл юм. Төслийн зорилго нь JUnit тест, Checkstyle дүрэм, JaCoCo code coverage, болон GitHub Actions CI процессийг ашиглан хөгжүүлэлтийг зохион байгуулах явдал юм.

## Төслийн бүтэц

calculator/
├─ pom.xml
├─ checkstyle.xml
├─ README.md
├─ .gitignore
├─ src/
│ ├─ main/
│ │ └─ java/labxx/sict/must/edu/mn/
│ │ ├─ Multiplication.java
│ │ └─ Division.java
│ └─ test/
│ └─ java/labxx/sict/must/edu/mn/
│ ├─ MultiplicationTest.java
│ └─ DivisionTest.java
└─ .github/
└─ workflows/
└─ ci.yml


- **src/main/java** – Эх код.
- **src/test/java** – JUnit тестүүд.
- **pom.xml** – Maven хамаарлууд болон plugin-ууд.
- **checkstyle.xml** – Google Checkstyle дүрэм.
- **.github/workflows/ci.yml** – CI процессын workflow.
- **.gitignore** – target/, *.class, .idea/ файлуудыг оруулахгүй.

## Шаардлага

- Java 17
- Maven 3.8+
- Git
- GitHub аккаунт

## Maven Командууд

- **JUnit тест ажиллуулах**  
```bash
mvn test

Checkstyle шалгах

mvn checkstyle:check


JaCoCo coverage шалгах (100% branch coverage шаарддаг)

mvn jacoco:check


JaCoCo тайлан үүсгэх

mvn jacoco:report


Тайлан target/site/jacoco/index.html дээр үүснэ.

Салбарын урсгал

main – Үндсэн хамгаалалттай салбар. Шууд push хийх хориотой.

develop – Хөгжүүлэлтийн үндсэн салбар.

feature/ – Шинэ онцлог нэмэх салбарууд.

release/ – Тогтвортой хувилбарын салбар.

hotfix/ – Хурдан засварын салбар.

Branch Protection

main салбарт шууд push хориглосон.

Pull Request-аар merge хийх шаардлагатай.

CI шалгалт (JUnit, Checkstyle, JaCoCo) амжилттай байх ёстой.

CI Процесс (GitHub Actions)

CI процесс нь develop болон release/* салбаруудын push болон pull request дээр дараахыг хийдэг:

Кодыг checkout хийх.

JDK 17 тохируулах.

Checkstyle шалгах (mvn checkstyle:check).

JUnit тест ажиллуулах (mvn test).

JaCoCo coverage шалгах (mvn jacoco:check).

JaCoCo тайлан үүсгэх (mvn jacoco:report).

CI шалгалт амжилтгүй бол merge хийх боломжгүй.

Онцлогын салбар үүсгэх

develop салбараас feature/add-multiplication үүсгэн, Multiplication функц нэмнэ.

JUnit тестүүдээр бүх нөхцөл, exception-уудыг хамруулж 100% branch coverage хангана.

Checkstyle дүрмийг дагаж байгаа эсэхийг шалгана.

Pull Request үүсгэж, CI шалгалт амжилттай бол merge хийнэ.

Release болон Hotfix

release/v1.0.0 үүсгэж tag хийх:

git tag v1.0.0
git push origin v1.0.0


Хотфикс хийх:
hotfix/v1.0.1 салбар үүсгэн алдааг засварлах, тест, coverage болон Checkstyle хангах.

Хотфиксыг release болон develop руу PR-аар merge хийнэ.

Хотфиксыг tag хийх:

git tag v1.0.1
git push origin v1.0.1
