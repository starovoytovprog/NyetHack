/**
 * Обучающий проект
 *
 * @author Антон
 * @since 2020.10.16
 */

fun main() {
    val numLetters = "Mississippi".count({ letter ->
        letter == 's'
    })
    print(numLetters)
}
