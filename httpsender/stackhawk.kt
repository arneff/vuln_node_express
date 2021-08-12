import org.parosproxy.paros.network.HttpMessage
import org.zaproxy.zap.extension.script.HttpSenderScriptHelper

fun sendingRequest(msg: HttpMessage, initiator: Int, helper: HttpSenderScriptHelper) {
    // do stuff to request going to the server
    // msg.getRequestHeader().setHeader("X-Script-Header", "ScriptValue")
    val headers =
        mapOf(
            "X-Script-Header1" to "Script-Value-1",
            "X-Script-Header2" to "Script-Value-2",
            "X-Script-Header3" to "Script-Value-3"
        )
    for (x in headers.keys) {
        msg.getRequestHeader().setHeader(x, headers[x])
    }

}

fun responseReceived(msg: HttpMessage, initiator: Int, helper: HttpSenderScriptHelper) {
    // do stuff with the response from the server

}