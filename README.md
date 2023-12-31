# Unit-тесты. Семинар 05

## Другие виды тестирования

__Задание 1.__ 

Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача — придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет.

#### Решение

1. Тест «Добавить контакт» (юнит тест) — проверяет, корректно ли работает функция добавления нового контакта в базу данных.

2. Тест «Редактировать контакт» (юнит тест) — проверяет корректность редактирования существующего контакта.

3. Тест «Удалить контакт» (юнит тест) — проверяет возможность удаления контакта из базы данных.

4. Тест «Уникальность имени контакта» (юнит тест) — проверка, что в базе данных нет двух контактов с одинаковым именем.

5. Тест «Валидация полей» (юнит тест) — гарантирует, что все обязательные поля при добавлении или редактировании контакта заполнены.

6. Тест «Получить все контакты» (интеграционный тест) — тестирует, корректно ли приложение возвращает все контакты из базы данных.

7. Тест «Восстановление удаленного контакта» (интеграционный тест) — восстанавливает удаленный контакт из базы данных и проверяет его корректное отображение.

8. Тест «Поиск контакт по имени» (сквозной тест) — ищет контакт в базе данных по заданному имени и проверяет, возвращает ли приложение корректный результат.

---

__Задание 2.__

Ниже список тестовых сценариев. Ваша задача — определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили.
1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов.
2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов.
3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.

#### Решение

1. Юнит-тест — проверяет корректную функциональность: добавление нового контакта в список контактов.

2. Интеграционный тест — проверяет взаимодействие модулей системы друг с другом. В конкретном случае — между пользовательским интерфейсом и внутренней функцией приложения.

3. Сквозной тест — собственно это и есть — проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление.