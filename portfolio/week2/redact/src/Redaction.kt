// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(text: String, target: String, char: Char = 'X'): String {
    if (target.isEmpty()) return text
    return text.replace(target, char.toString().repeat(target.length))
}
