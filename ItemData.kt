class ItemData(originalValue: Any) {
    private val originalValue: Any = originalValue

    fun getType(): String? {
        return when (originalValue) {
            is String -> "caden"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    fun getInfo(): String {
        return when (originalValue) {
            is String -> "L${originalValue.length}" // largo del string
            else -> ""
        }
    }
}
