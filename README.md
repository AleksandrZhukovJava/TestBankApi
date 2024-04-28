# TestBankApi
Реализовать простое банковское API.
Содержание:
1) Контроллер, выполняет CRUD (create, read, update, delete) операции над клиентами + дополнительные
2) Контроллер безопасности, позволяет менять password или username пользователя
3) Контроллер техсапорта, используется сотруднкиами банка
4) Сервис аутентификации который проверяет что переданный объект аутификации действительно пренадлежит пользователю вносящиму изменения
5) Сервис работы с клиентами, выполняет основные и дополнительные операции и взаимодействует с репозиторием
6) Модели, Person - клиент банка, Authorization - объект для авторизации, Account - счет клиента
7) AccountRepository - хранит забаненные аккаунты
8) ClientRepository - хранит информацию клиентов

Необходимо:
1) Реализовать нужные связи между классами при помощи DI
2) Подключить веб интерфейс swagger + Spring WEB, REST API
3) Собрать проект с учетом всех возможностей Spring CORE

Требуемый функционал:
1) Регистрация нового клиента
2) Смена пароля или никнейма
3) Смена данных профиля
4) Удаление аккаунта
5) Возможность получить баланс своих счетов
6) Возможность получить список всех клиентов
7) Возможность принудительно поменять данные профиля или аутентификацию
8) Возможность пополнить свой счет
9) Возможность отрыть новый счет
10) Возможность закрыть счет
11) Возможность заблокировать/разблокировать конкретный счет клиента
12) Возможность сменить тип счета
13) Возможность заблокировать/разблокировать полностью аккаунт клиента
14) Возможность сменить статус клиента
15) Возможонсть получить список клиентов с задолженностью по счетам (минусовой баланс)
16) Ендпоинт который меняет статусы всех клиентов с отрицательным балансом на более низкий VIP -> NORMAL, NORMAL -> DANGEROUS, DANGEROUS -> BLOCKED
17) Ендпоинт поднятия статуса клиента
18) получить информацию по аккаунту по id
19) получить информацию по клиенту по id

Требования:
1) Понятное сообщение с нужным кодом ответа если клиент не верно авторизировался
2) Валидация данных клиента:
* Ник должен содержать только латинские буквы или цифры до знака @ после чего mail или gmail после них точка и любой префикс из двух латинских букв,
максимальный размер - 15 символов.
* Пароль может содержать только цифры и буквы не меньше 5 и не больше 20 знаков, один символ и начинаться с заглавной буквы
* Имя Фамилия не больше 15 знаков только буквы
* паспорт, формат - 2 цифры пробел 2 цифры пробел 6 цифр
* номер социального страхования - должен содержать 2 цифры, тире, и от 8 до 12 цифр после
* максимальное количество аккаунтов - 5
После каждой ошибки - понятное оповещение
3) При достижении порога в 4 аккаунта клиента предепреждает о том что осталось 1 место
4) Теже валидации для замены данных
5) Тех сапорты могут менять данные нарушая валидацию
6) Работа со своим аккаунтом возможна только если передана корректная валидация, если передана чужая выдается ошибка
7) Данные возвращаются в понятном обработанном виде
8) Заблокированный счета добавляются в черный список
9) ID счетов и клиентов не повторяются.
10) клиент не может получить доступ в чужжому аккаунту даже зная его номер

Заметки:
Важно продумать какой функционал в каком сервисе/контроллере должен быть
Допускается менять струтктуру проекта если она улучшает архитектуру
Важно использовать возможности Spring Core
Валидации в тех сапорт контроллер не требуется, тк как у клиента нет его адресов
