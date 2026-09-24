//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Введите ключевое слово: ")
    val key = readln().lowercase()
    print("Введите исходный текст: ")
    val text = readln().lowercase()
    val letters = charArrayOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и',
        'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
        'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')
    val numbers = intArrayOf(21, 13, 4, 20, 22, 1, 25, 12, 24, 14, 2, 28, 9,
        23, 3, 29, 6, 16, 15, 11, 26, 5, 30, 27, 8, 18, 10, 33, 31, 32, 19, 7, 17)
    var result = ""
    var keyIndex = 0
    for (i in 0..text.length - 1) {
        var textNumber = 0
        var keyNumber = 0
        for (j in 0..letters.size - 1) {
            if (letters[j] == text[i]) {
                textNumber = numbers[j]
            }
            if (letters[j] == key[keyIndex]) {
                keyNumber = numbers[j]
            }
        }
        var newNumber = textNumber + keyNumber
        if (newNumber > 33) {
            newNumber -= 33
        }
        for (j in 0..numbers.size - 1) {
            if (numbers[j] == newNumber) {
                result += letters[j]
            }
        }
        keyIndex++
        if (keyIndex == key.length) {
            keyIndex = 0
        }
    }
    println("Зашифрованный текст: $result")
}