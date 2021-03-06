
package webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebService5InARow", targetNamespace = "http://WebService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebService5InARow {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "join", targetNamespace = "http://WebService/", className = "webservice.Join")
    @ResponseWrapper(localName = "joinResponse", targetNamespace = "http://WebService/", className = "webservice.JoinResponse")
    @Action(input = "http://WebService/WebService5InARow/joinRequest", output = "http://WebService/WebService5InARow/joinResponse")
    public String join(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     */
    @WebMethod
    @RequestWrapper(localName = "quit", targetNamespace = "http://WebService/", className = "webservice.Quit")
    @ResponseWrapper(localName = "quitResponse", targetNamespace = "http://WebService/", className = "webservice.QuitResponse")
    @Action(input = "http://WebService/WebService5InARow/quitRequest", output = "http://WebService/WebService5InARow/quitResponse")
    public void quit(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param name
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "nameCheck", targetNamespace = "http://WebService/", className = "webservice.NameCheck")
    @ResponseWrapper(localName = "nameCheckResponse", targetNamespace = "http://WebService/", className = "webservice.NameCheckResponse")
    @Action(input = "http://WebService/WebService5InARow/nameCheckRequest", output = "http://WebService/WebService5InARow/nameCheckResponse")
    public boolean nameCheck(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "upadteBoard", targetNamespace = "http://WebService/", className = "webservice.UpadteBoard")
    @ResponseWrapper(localName = "upadteBoardResponse", targetNamespace = "http://WebService/", className = "webservice.UpadteBoardResponse")
    @Action(input = "http://WebService/WebService5InARow/upadteBoardRequest", output = "http://WebService/WebService5InARow/upadteBoardResponse")
    public String upadteBoard();

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "readyToStart", targetNamespace = "http://WebService/", className = "webservice.ReadyToStart")
    @ResponseWrapper(localName = "readyToStartResponse", targetNamespace = "http://WebService/", className = "webservice.ReadyToStartResponse")
    @Action(input = "http://WebService/WebService5InARow/readyToStartRequest", output = "http://WebService/WebService5InARow/readyToStartResponse")
    public boolean readyToStart();

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "gameOver", targetNamespace = "http://WebService/", className = "webservice.GameOver")
    @ResponseWrapper(localName = "gameOverResponse", targetNamespace = "http://WebService/", className = "webservice.GameOverResponse")
    @Action(input = "http://WebService/WebService5InARow/gameOverRequest", output = "http://WebService/WebService5InARow/gameOverResponse")
    public boolean gameOver();

    /**
     * 
     * @param name
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "turn", targetNamespace = "http://WebService/", className = "webservice.Turn")
    @ResponseWrapper(localName = "turnResponse", targetNamespace = "http://WebService/", className = "webservice.TurnResponse")
    @Action(input = "http://WebService/WebService5InARow/turnRequest", output = "http://WebService/WebService5InARow/turnResponse")
    public boolean turn(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "resetServer", targetNamespace = "http://WebService/", className = "webservice.ResetServer")
    @ResponseWrapper(localName = "resetServerResponse", targetNamespace = "http://WebService/", className = "webservice.ResetServerResponse")
    @Action(input = "http://WebService/WebService5InARow/resetServerRequest", output = "http://WebService/WebService5InARow/resetServerResponse")
    public void resetServer();

    /**
     * 
     * @param column
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dropPiece", targetNamespace = "http://WebService/", className = "webservice.DropPiece")
    @ResponseWrapper(localName = "dropPieceResponse", targetNamespace = "http://WebService/", className = "webservice.DropPieceResponse")
    @Action(input = "http://WebService/WebService5InARow/dropPieceRequest", output = "http://WebService/WebService5InARow/dropPieceResponse")
    public String dropPiece(
        @WebParam(name = "column", targetNamespace = "")
        int column);

}
