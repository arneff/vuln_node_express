import org.parosproxy.paros.network.HttpMessage
import org.zaproxy.zap.extension.script.HttpSenderScriptHelper

fun sendingRequest(msg: HttpMessage, initiator: Int, helper: HttpSenderScriptHelper) {
    //do stuff to request going to the server
    msg.getRequestHeader().setHeader("User-Agent", "ScriptHeader")
}

fun responseReceived(msg: HttpMessage, initiator: Int, helper: HttpSenderScriptHelper) {
    //do stuff with the response from the server
    continue;
}