// "Specify type explicitly" "true"
import java.util.HashMap

fun foo(map : HashMap<String, Int>) {
    for (<caret>entry : MutableMap.MutableEntry<String, Int> in map.entrySet()) {

    }
}