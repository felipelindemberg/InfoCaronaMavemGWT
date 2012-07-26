package vai.client;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class InfoCaronaServer_Proxy extends RemoteServiceProxy implements vai.client.InfoCaronaServerAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "vai.client.InfoCaronaServer";
  private static final String SERIALIZATION_POLICY ="8959A21F1B798F2A2A4D2A98A4F80637";
  private static final vai.client.InfoCaronaServer_TypeSerializer SERIALIZER = new vai.client.InfoCaronaServer_TypeSerializer();
  
  public InfoCaronaServer_Proxy() {
    super(GWT.getModuleBaseURL(),
      "greet", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void abrirSessao(java.lang.String login, java.lang.String senha, com.google.gwt.user.client.rpc.AsyncCallback asyncCallback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "abrirSessao");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(login);
      streamWriter.writeString(senha);
      helper.finish(asyncCallback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      asyncCallback.onFailure(ex);
    }
  }
  
  public void cadastrarCarona(java.lang.String idUsuario, java.lang.String origem, java.lang.String destino, java.lang.String data, java.lang.String hora, java.lang.String vagas, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "cadastrarCarona");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 6);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idUsuario);
      streamWriter.writeString(origem);
      streamWriter.writeString(destino);
      streamWriter.writeString(data);
      streamWriter.writeString(hora);
      streamWriter.writeString(vagas);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void cadastrarCaronaMunicipal(java.lang.String idUsuario, java.lang.String origem, java.lang.String destino, java.lang.String cidade, java.lang.String data, java.lang.String hora, java.lang.String vagas, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "cadastrarCaronaMunicipal");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idUsuario);
      streamWriter.writeString(origem);
      streamWriter.writeString(destino);
      streamWriter.writeString(cidade);
      streamWriter.writeString(data);
      streamWriter.writeString(hora);
      streamWriter.writeString(vagas);
      helper.finish(retorno, ResponseReader.STRING);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void cadastrarNovosPontosEncontro(java.lang.String idSessao, java.lang.String idCarona, java.lang.String novosPontos, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "cadastrarNovosPontosEncontro");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      streamWriter.writeString(idCarona);
      streamWriter.writeString(novosPontos);
      helper.finish(retorno, ResponseReader.STRING);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void criarUsuario(java.lang.String login, java.lang.String senha, java.lang.String nome, java.lang.String endereco, java.lang.String email, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "criarUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 5);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(login);
      streamWriter.writeString(senha);
      streamWriter.writeString(nome);
      streamWriter.writeString(endereco);
      streamWriter.writeString(email);
      helper.finish(retorno, ResponseReader.VOID);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void encerrarSistema(com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "encerrarSistema");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(retorno, ResponseReader.STRING);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getInformacoesCarona(java.lang.String idCarona, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getInformacoesCarona");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idCarona);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getInformacoesUsuario(java.lang.String login, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getInformacoesUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(login);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getListaCaronasUsuario(java.lang.String idSessao, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getListaCaronasUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getListaMotoristaPontoEncontroCarona(java.lang.String idCarona, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getListaMotoristaPontoEncontroCarona");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idCarona);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getListaPontoEncontroCarona(java.lang.String idCarona, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getListaPontoEncontroCarona");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idCarona);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getListaSolicitacoesCarona(java.lang.String idCarona, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getListaSolicitacoesCarona");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idCarona);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getLoginUsuarioLogado(java.lang.String idSessao, com.google.gwt.user.client.rpc.AsyncCallback login) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getLoginUsuarioLogado");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      helper.finish(login, ResponseReader.STRING);
    } catch (SerializationException ex) {
      login.onFailure(ex);
    }
  }
  
  public void getSolicitacoesAceitasUsuario(java.lang.String idSessao, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getSolicitacoesAceitasUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getSolicitacoesPendentesUsuario(java.lang.String idSessao, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getSolicitacoesPendentesUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getSolicitacoesRejeitadasUsuario(java.lang.String idSessao, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getSolicitacoesRejeitadasUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void getTodasCaronas(com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "getTodasCaronas");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(retorno, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void setInformacoesUsuario(java.lang.String idSessao, java.lang.String nome, java.lang.String endereco, java.lang.String email, java.lang.String novaSenha, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "setInformacoesUsuario");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 5);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      streamWriter.writeString(nome);
      streamWriter.writeString(endereco);
      streamWriter.writeString(email);
      streamWriter.writeString(novaSenha);
      helper.finish(retorno, ResponseReader.STRING);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  
  public void solicitarVagaPontoEncontro(java.lang.String idSessao, java.lang.String idCarona, java.lang.String ponto, com.google.gwt.user.client.rpc.AsyncCallback retorno) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("InfoCaronaServer_Proxy", "solicitarVagaPontoEncontro");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(idSessao);
      streamWriter.writeString(idCarona);
      streamWriter.writeString(ponto);
      helper.finish(retorno, ResponseReader.STRING);
    } catch (SerializationException ex) {
      retorno.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
