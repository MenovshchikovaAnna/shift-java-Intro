<11.11.2025>
Внесены корректировки в файл README.md 

<13.11.2025>
Внесены корректировки в файл LogicalOperationTable.java

<15.11.2025>
Внесены корректировки в файл MultiplicationTable.java

<18.11.2025>
Внесены корректировки в файл LogicalOperationTable.java
Внесены корректировки в файл MultiplicationTable.java

<19.11.2025>
Внесены корректировки в файл WorkingWithStrings.java
Внесены корректировки в файл PrintMultiplicationTable.java

<20.11.2025>
Внесены правки в файл WorkingWithStrings.java после ревью:
- количество используемых в main сокращено до stringInput, characterInput и stringOutput

Внесены правки в файл PrintMultiplicationTable.java после ревью:
- добавлена обработка FileNotFoundException,
- close вынесен в finally.

Создан файл Transformers.java:
- Добавлены классы Transformer, Autobot, Decepticon,
- Реализован сценарий: создание трансформеров и выполнение ими основных действий

<22.11.2025>
Внесены корректировки в файл TransformersAbstract.java
- класс Transformer преобразован в абстрактный класс, 
- из класса Transformer удалены методы run(), fire(), charge(), 
- в класс Transformer добавлен абстрактный метод transform(), 
- создан файл интерфейс Action.java, 
- в интерфейс Action перенесены методы run(), fire(), charge(), 
- метод run() установлен как метод по-умолчанию, 
- создан список трансформеров

<26.11.2025>
Правки файла Transformers.java после ревью:
- добавлен модификатор static переменной eyeColor,
- классы Autobot, Decepticon, Transformer вынесены в отдельные файлы,
- добавлена возможность пользователю указать, во что трансформируется трансформер,
- убран abstract перед классом Transformer,
- выполнение действий для трансформера вынесено в отдельную функцию,
- в стиль заполнения файла Changelog.md внесены изменения (изменена часть файла)