## Проект по автоматизации тестирования мобильной версии сайта [Википедия](https://ru.wikipedia.org/wiki/Заглавная_страница)
<p align="center">
<img title="Wiki" src="media/wiki.jpg">
</p>

## Содержание:

- [Использованный стек технологий](#computer-использованный-стек-технологий)
- [Список проверок, реализованных в автотестах](#arrow_forward-запуск-тестов-из-терминала)
- [Сборка в Jenkins](#сборка-в-jenkins)
- [Пример Allure-отчета](#пример-allure-отчета)
- [Уведомления в Telegram с использованием бота](#уведомления-в-telegram-с-использованием-бота)
- [Видео примера запуска тестов в Selenoid](#-видео-примера-запуска-теста-в-selenoid)

  ## :computer: Использованный стек технологий
  
 <p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="media/IJ.svg" width="60" height="60"  alt="IDEA"/></a>
<a href="https://appium.io/docs/en/latest/"><img src="media/Appium.svg" width="60" height="60"  alt="Appium"/></a>
<a href="https://www.browserstack.com/"><img src="media/Browserstack.svg" width="60" height="60"  alt="Browserstack"/></a>
<a href="https://www.java.com/"><img src="/media/java.svg" width="60" height="60"  alt="Java"/></a>
<a href="https://github.com/allure-framework"><img src="media/allure.svg" width="60" height="60"  alt="Allure"/></a>
<a href="https://gradle.org/"><img src="media/gradle.svg" width="60" height="60"  alt="Gradle"/></a>
<a href="https://junit.org/junit5/"><img src="media/jUnit5.svg" width="60" height="60"  alt="JUnit 5"/></a>
<a href="https://github.com/"><img src="media/gitHub.svg" width="60" height="60"  alt="GitHub"/></a>
<a href="https://www.jenkins.io/"><img src="media/jenkins.svg" width="60" height="60"  alt="Jenkins"/></a>
<a href="https://web.telegram.org/"><img src="media/telegram.svg" width="60" height="60"  alt="Telegram"/></a>
<a href="https://www.atlassian.com/software/jira/"><img src="media/Jira.svg" width="60" height="60" alt="Jira" title="Jira"/></a> 
</p>

- В проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Appium](https://appium.io/docs/en/latest/).
- Для сборки проекта используется <code>Gradle</code>.  
- Для тестирования приложения используется фреймворк <code>JUnit 5</code>.
- Для локального тестирования приложения на мобильных устройствах используется Appium
- Для удаленного тестирования в различных платформах Browserstack
- Для визуализации результатов тестирования Allure Report, AllureTestOps и Telegram Bot 
  
## Список автотестов
**При запуске удаленно:**
- Мобильное тестирование сервиса главной страницы
- Открытие первой статьи
- Проверка корректного ввода и совпадения введенного текста в выпадающем списке


## :arrow_forward: Запуск автотестов

### Запуск тестов на удаленном браузере

Запуск удаленно:
```
gradle clean test

```

## <img src="media/jenkins.svg" title="Allure TestOps" width="4%"/> Созданный проект в [Jenkins](https://jenkins.autotests.cloud/job/023_diplom_lia_lesnikov_Mobile/)
<p align="center">
<img title="allure-report" src="media/jenkinsJoba.png">
</p>

## <img src="media/allure.svg" title="Allure TestOps" width="4%"/> Пример [Allure-отчета](https://jenkins.autotests.cloud/job/023_diplom_lia_lesnikov_Mobile/allure/)
В отчете отображены пройденные автотесты
<p align="center">
<img title="Allure Overview" src="media/allure-report.png">
</p>

## Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/4090/launches)

Выполнена интеграция сборки <code>Jenkins</code> с <code>Allure TestOps</code>.
Результат выполнения автотестов отображается в <code>Allure TestOps</code>
На Dashboard в <code>Allure TestOps</code> отображена статистика пройденных тестов.

<p align="center">
<img title="Allure TestOps DashBoard" src="media/allureTestOps.png">
</p>

## <img src="media/Jira.svg" title="Allure TestOps" width="4%"/> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1136)

Реализована интеграция <code>Allure TestOps</code> с <code>Jira</code>, в тикете отображается информация, какие тест-кейсы были написаны в рамках задачи и результат их прогона.

<p align="center">
<img title="Jira Task" src="media/jiraTask.png">
</p>

## <img width="4%" style="vertical-align:middle" title="Telegram" src="media/telegram.svg"> Уведомления в Telegram с использованием бота

После завершения сборки приходит уведомления в Telegram

<p align="center">
<img width="40%"  title="Telegram Notifications" src="media/telegramBot.png">
</p>

## Видео примера запуска тестов в Selenoid

К каждому автотесту прилагается видео в Allure отчете
<p align="center">
  <img title="Selenoid Video" src="media/videoTest.gif">
</p>
