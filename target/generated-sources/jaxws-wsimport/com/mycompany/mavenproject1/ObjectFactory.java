
package com.mycompany.mavenproject1;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mycompany.mavenproject1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfCargosDescuentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfCargosDescuentos");
    private final static QName _Tributos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Tributos");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ArrayOfAnticipos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfAnticipos");
    private final static QName _ArrayOfDatosPacienteSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDatosPacienteSalud");
    private final static QName _DocumentStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DocumentStatusResponse");
    private final static QName _Entrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Entrega");
    private final static QName _MediosDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "MediosDePago");
    private final static QName _ArrayOfMediosDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfMediosDePago");
    private final static QName _ArrayOfExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfExtras");
    private final static QName _Cliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Cliente");
    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ExtrasEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ExtrasEvento");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _DatosPacienteSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosPacienteSalud");
    private final static QName _CondicionDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CondicionDePago");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfImpuestosTotales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfImpuestosTotales");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ArrayOfGeneralSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfGeneralSalud");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Autorizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Autorizado");
    private final static QName _ArrayOfDatosExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDatosExtras");
    private final static QName _CargosDescuentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CargosDescuentos");
    private final static QName _InformacionLegal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "InformacionLegal");
    private final static QName _DatosExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosExtras");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _FacturaImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaImpuestos");
    private final static QName _Extensible_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extensible");
    private final static QName _ArrayOfOrdenDeCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfOrdenDeCompra");
    private final static QName _Evento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "Evento");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfHistorialDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfHistorialDeEntrega");
    private final static QName _Coordenadas_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Coordenadas");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _FacturaDetalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaDetalle");
    private final static QName _ArrayOfLineaInformacionAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfLineaInformacionAdicional");
    private final static QName _FoliosRemainingResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "FoliosRemainingResponse");
    private final static QName _Extras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Extras");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ArrayOfEvento");
    private final static QName _ArrayOfObligaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfObligaciones");
    private final static QName _ArrayOfFacturaImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfFacturaImpuestos");
    private final static QName _ArrayOfDocumentoReferenciado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDocumentoReferenciado");
    private final static QName _DatosEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosEvento");
    private final static QName _DownloadXMLResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DownloadXMLResponse");
    private final static QName _DescargarEventoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DescargarEventoResponse");
    private final static QName _FacturaGeneral_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "FacturaGeneral");
    private final static QName _DocumentoReferenciado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DocumentoReferenciado");
    private final static QName _GeneralSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "GeneralSalud");
    private final static QName _LineaInformacionAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LineaInformacionAdicional");
    private final static QName _ArrayOfCoordenadas_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfCoordenadas");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Direccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Direccion");
    private final static QName _ArrayOfCondicionDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfCondicionDePago");
    private final static QName _TasaDeCambio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambio");
    private final static QName _DownloadPDFResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DownloadPDFResponse");
    private final static QName _Obligaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Obligaciones");
    private final static QName _ImpuestosTotales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ImpuestosTotales");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Anticipos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Anticipos");
    private final static QName _ArrayOfDestinatario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfDestinatario");
    private final static QName _EventoResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "EventoResponse");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _DatosDelTransportista_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DatosDelTransportista");
    private final static QName _TerminosDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TerminosDeEntrega");
    private final static QName _DocumentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "DocumentResponse");
    private final static QName _ContenedorResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "ContenedorResponse");
    private final static QName _ArrayOfExtensible_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfExtensible");
    private final static QName _HistorialDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "HistorialDeEntrega");
    private final static QName _OrdenDeCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "OrdenDeCompra");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _SectorSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "SectorSalud");
    private final static QName _TasaDeCambioAlternativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TasaDeCambioAlternativa");
    private final static QName _BeneficiarioSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "BeneficiarioSalud");
    private final static QName _Destinatario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Destinatario");
    private final static QName _ArrayOfFacturaDetalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfFacturaDetalle");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _SendEmailResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "SendEmailResponse");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfTributos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ArrayOfTributos");
    private final static QName _LoadCertificateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "LoadCertificateResponse");
    private final static QName _ArrayOfExtrasEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ArrayOfExtrasEvento");
    private final static QName _MediosDePagoMedioPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "medioPago");
    private final static QName _MediosDePagoNumeroDias_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDias");
    private final static QName _MediosDePagoCodigoBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoBanco");
    private final static QName _MediosDePagoCodigoCanalPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoCanalPago");
    private final static QName _MediosDePagoExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "extras");
    private final static QName _MediosDePagoFechaDeVencimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaDeVencimiento");
    private final static QName _MediosDePagoNumeroDeReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDeReferencia");
    private final static QName _MediosDePagoCodigoReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoReferencia");
    private final static QName _MediosDePagoMetodoDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "metodoDePago");
    private final static QName _MediosDePagoNombreBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreBanco");
    private final static QName _MediosDePagoNumeroTransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroTransferencia");
    private final static QName _BeneficiarioSaludTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TipoIdentificacion");
    private final static QName _BeneficiarioSaludDireccionResidencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "DireccionResidencia");
    private final static QName _ExtrasEventoValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "valor");
    private final static QName _ExtrasEventoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "nombre");
    private final static QName _ExtrasEventoCodigoInterno2_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "codigoInterno2");
    private final static QName _ExtrasEventoCodigoInterno1_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "codigoInterno1");
    private final static QName _DescargaXMLTokenPassword_QNAME = new QName("http://tempuri.org/", "tokenPassword");
    private final static QName _DescargaXMLTokenEmpresa_QNAME = new QName("http://tempuri.org/", "tokenEmpresa");
    private final static QName _DescargaXMLDocumento_QNAME = new QName("http://tempuri.org/", "documento");
    private final static QName _GeneralSaludValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Valor");
    private final static QName _GeneralSaludNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Nombre");
    private final static QName _EstadoDocumentoResponseEstadoDocumentoResult_QNAME = new QName("http://tempuri.org/", "EstadoDocumentoResult");
    private final static QName _EnvioCorreoCorreo_QNAME = new QName("http://tempuri.org/", "correo");
    private final static QName _EnvioCorreoAdjuntos_QNAME = new QName("http://tempuri.org/", "adjuntos");
    private final static QName _DescargaXMLResponseDescargaXMLResult_QNAME = new QName("http://tempuri.org/", "DescargaXMLResult");
    private final static QName _TerminosDeEntregaCodigoCondicionEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoCondicionEntrega");
    private final static QName _TerminosDeEntregaCostoTransporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "costoTransporte");
    private final static QName _TerminosDeEntregaIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "identificacion");
    private final static QName _TerminosDeEntregaCargosDescuentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cargosDescuentos");
    private final static QName _TerminosDeEntregaResponsableEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "responsableEntrega");
    private final static QName _TerminosDeEntregaMonto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "monto");
    private final static QName _TerminosDeEntregaDireccionEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionEntrega");
    private final static QName _SectorSaludPacientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Pacientes");
    private final static QName _SectorSaludTipoEscenario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "TipoEscenario");
    private final static QName _SectorSaludBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "Beneficiario");
    private final static QName _SectorSaludIdPersonalizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "IdPersonalizacion");
    private final static QName _CargarCertificadoResponseCargarCertificadoResult_QNAME = new QName("http://tempuri.org/", "CargarCertificadoResult");
    private final static QName _InformacionLegalCodigoEstablecimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoEstablecimiento");
    private final static QName _InformacionLegalNumeroIdentificacionDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroIdentificacionDV");
    private final static QName _InformacionLegalNumeroIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroIdentificacion");
    private final static QName _InformacionLegalTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoIdentificacion");
    private final static QName _InformacionLegalPrefijoFacturacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "prefijoFacturacion");
    private final static QName _InformacionLegalNombreRegistroRUT_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreRegistroRUT");
    private final static QName _InformacionLegalNumeroMatriculaMercantil_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroMatriculaMercantil");
    private final static QName _DatosPacienteSaludCamposGenerales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "CamposGenerales");
    private final static QName _DatosEventoComentario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "comentario");
    private final static QName _DatosEventoCodigoEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoEvento");
    private final static QName _DatosEventoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "documento");
    private final static QName _DatosEventoCodigoInterno1_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoInterno1");
    private final static QName _DatosEventoCodigoInterno2_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoInterno2");
    private final static QName _CargarCertificadoPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _CargarCertificadoCertificado_QNAME = new QName("http://tempuri.org/", "certificado");
    private final static QName _DescargarEventoXMLResponseDescargarEventoXMLResult_QNAME = new QName("http://tempuri.org/", "DescargarEventoXMLResult");
    private final static QName _ExtensibleNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombre");
    private final static QName _ExtensibleControlInterno1_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "controlInterno1");
    private final static QName _ExtensibleValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "valor");
    private final static QName _ExtensibleControlInterno2_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "controlInterno2");
    private final static QName _FacturaImpuestosCodigoTOTALImp_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoTOTALImp");
    private final static QName _FacturaImpuestosUnidadMedidaTributo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "unidadMedidaTributo");
    private final static QName _FacturaImpuestosBaseImponibleTOTALImp_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "baseImponibleTOTALImp");
    private final static QName _FacturaImpuestosControlInterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "controlInterno");
    private final static QName _FacturaImpuestosPorcentajeTOTALImp_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "porcentajeTOTALImp");
    private final static QName _FacturaImpuestosUnidadMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "unidadMedida");
    private final static QName _FacturaImpuestosValorTOTALImp_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "valorTOTALImp");
    private final static QName _FacturaImpuestosValorTributoUnidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "valorTributoUnidad");
    private final static QName _CargosDescuentosMontoBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoBase");
    private final static QName _CargosDescuentosSecuencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "secuencia");
    private final static QName _CargosDescuentosPorcentaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "porcentaje");
    private final static QName _CargosDescuentosDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "descripcion");
    private final static QName _CargosDescuentosIndicador_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicador");
    private final static QName _CargosDescuentosCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigo");
    private final static QName _ImpuestosTotalesMontoTotal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoTotal");
    private final static QName _ImpuestosTotalesRedondeoAplicado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "redondeoAplicado");
    private final static QName _LoadCertificateResponseMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensaje");
    private final static QName _LoadCertificateResponseResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "resultado");
    private final static QName _TasaDeCambioBaseMonedaOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "baseMonedaOrigen");
    private final static QName _TasaDeCambioIndicadorDeTasa_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicadorDeTasa");
    private final static QName _TasaDeCambioMonedaDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "monedaDestino");
    private final static QName _TasaDeCambioBaseMonedaDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "baseMonedaDestino");
    private final static QName _TasaDeCambioOperadorCalculo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "operadorCalculo");
    private final static QName _TasaDeCambioFechaDeTasaDeCambio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaDeTasaDeCambio");
    private final static QName _TasaDeCambioMonedaOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "monedaOrigen");
    private final static QName _TasaDeCambioTasaDeCambio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tasaDeCambio");
    private final static QName _DescargarEventoXMLDocumentoEvento_QNAME = new QName("http://tempuri.org/", "documentoEvento");
    private final static QName _FacturaDetalleIdEsquema_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "idEsquema");
    private final static QName _FacturaDetalleImpuestosTotales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "impuestosTotales");
    private final static QName _FacturaDetalleCantidadPorEmpaque_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadPorEmpaque");
    private final static QName _FacturaDetalleEstandarCodigoID_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoID");
    private final static QName _FacturaDetallePrecioReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioReferencia");
    private final static QName _FacturaDetalleCantidadReal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadReal");
    private final static QName _FacturaDetalleCantidadRealUnidadMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadRealUnidadMedida");
    private final static QName _FacturaDetalleMandatorioTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mandatorioTipoIdentificacion");
    private final static QName _FacturaDetalleSubCodigoFabricante_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "subCodigoFabricante");
    private final static QName _FacturaDetalleMandatorioNumeroIdentificacionDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mandatorioNumeroIdentificacionDV");
    private final static QName _FacturaDetalleCantidadUnidades_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadUnidades");
    private final static QName _FacturaDetalleInformacionAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "informacionAdicional");
    private final static QName _FacturaDetalleNota_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nota");
    private final static QName _FacturaDetalleCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoProducto");
    private final static QName _FacturaDetallePrecioTotal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioTotal");
    private final static QName _FacturaDetalleCodigoTipoPrecio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoTipoPrecio");
    private final static QName _FacturaDetalleSeriales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "seriales");
    private final static QName _FacturaDetalleDescripcionTecnica_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "descripcionTecnica");
    private final static QName _FacturaDetalleMandatorioNumeroIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mandatorioNumeroIdentificacion");
    private final static QName _FacturaDetalleEstandarCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoProducto");
    private final static QName _FacturaDetalleMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "marca");
    private final static QName _FacturaDetalleDescripcion3_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "descripcion3");
    private final static QName _FacturaDetalleModelo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "modelo");
    private final static QName _FacturaDetallePrecioTotalSinImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioTotalSinImpuestos");
    private final static QName _FacturaDetalleDescripcion2_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "descripcion2");
    private final static QName _FacturaDetalleEstandarOrganizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarOrganizacion");
    private final static QName _FacturaDetalleCodigoFabricante_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoFabricante");
    private final static QName _FacturaDetalleCodigoIdentificadorPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoIdentificadorPais");
    private final static QName _FacturaDetalleNombreFabricante_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreFabricante");
    private final static QName _FacturaDetalleTipoAIU_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoAIU");
    private final static QName _FacturaDetalleImpuestosDetalles_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "impuestosDetalles");
    private final static QName _FacturaDetalleEstandarCodigoIdentificador_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoIdentificador");
    private final static QName _FacturaDetalleMuestraGratis_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "muestraGratis");
    private final static QName _FacturaDetalleDocumentosReferenciados_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "documentosReferenciados");
    private final static QName _FacturaDetalleSubCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "subCodigoProducto");
    private final static QName _FacturaDetalleEstandarCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigo");
    private final static QName _FacturaDetalleEstandarCodigoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarCodigoNombre");
    private final static QName _FacturaDetallePrecioVentaUnitario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "precioVentaUnitario");
    private final static QName _FacturaDetalleEstandarSubCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "estandarSubCodigoProducto");
    private final static QName _DescargarEventoResponseFechaRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "fechaRespuesta");
    private final static QName _DescargarEventoResponseHash_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "hash");
    private final static QName _DescargarEventoResponseCufe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "cufe");
    private final static QName _DescargarEventoResponseDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "documento");
    private final static QName _DescargarEventoResponseTipoCufe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "tipoCufe");
    private final static QName _AutorizadoTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "telefono");
    private final static QName _AutorizadoEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "email");
    private final static QName _AutorizadoTelefax_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "telefax");
    private final static QName _AutorizadoNombreComercial_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreComercial");
    private final static QName _AutorizadoDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccion");
    private final static QName _AutorizadoNumeroDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDocumento");
    private final static QName _AutorizadoNumeroDocumentoDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroDocumentoDV");
    private final static QName _AutorizadoNombreContacto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreContacto");
    private final static QName _AutorizadoRazonSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "razonSocial");
    private final static QName _LineaInformacionAdicionalFechaFin_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaFin");
    private final static QName _LineaInformacionAdicionalUnidadMedidaTransporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "unidadMedidaTransporte");
    private final static QName _LineaInformacionAdicionalCantidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidad");
    private final static QName _LineaInformacionAdicionalFechaInicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaInicio");
    private final static QName _LineaInformacionAdicionalTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipo");
    private final static QName _ClienteDestinatario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "destinatario");
    private final static QName _ClienteDireccionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionCliente");
    private final static QName _ClienteDireccionFiscal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionFiscal");
    private final static QName _ClienteInformacionLegalCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "informacionLegalCliente");
    private final static QName _ClienteNombreRazonSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreRazonSocial");
    private final static QName _ClienteNotificar_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "notificar");
    private final static QName _ClienteTipoPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoPersona");
    private final static QName _ClienteSegundoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "segundoNombre");
    private final static QName _ClienteDetallesTributarios_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "detallesTributarios");
    private final static QName _ClienteResponsabilidadesRut_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "responsabilidadesRut");
    private final static QName _ClienteApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "apellido");
    private final static QName _ClienteActividadEconomicaCIIU_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "actividadEconomicaCIIU");
    private final static QName _GenerarEventoDatosEvento_QNAME = new QName("http://tempuri.org/", "datosEvento");
    private final static QName _GenerarEventoResponseGenerarEventoResult_QNAME = new QName("http://tempuri.org/", "GenerarEventoResult");
    private final static QName _OrdenDeCompraDocumentoReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "documentoReferencia");
    private final static QName _OrdenDeCompraUuid_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "uuid");
    private final static QName _OrdenDeCompraNumeroPedido_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroPedido");
    private final static QName _OrdenDeCompraTipoCUFE_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoCUFE");
    private final static QName _OrdenDeCompraCodigoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoCliente");
    private final static QName _OrdenDeCompraTipoOrden_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoOrden");
    private final static QName _OrdenDeCompraFecha_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fecha");
    private final static QName _OrdenDeCompraNumeroOrden_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroOrden");
    private final static QName _ExtrasXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "xml");
    private final static QName _ExtrasPdf_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "pdf");
    private final static QName _FacturaGeneralPropina_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "propina");
    private final static QName _FacturaGeneralConsecutivoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "consecutivoDocumento");
    private final static QName _FacturaGeneralTotalProductos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalProductos");
    private final static QName _FacturaGeneralCondicionPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "condicionPago");
    private final static QName _FacturaGeneralAnticipos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "anticipos");
    private final static QName _FacturaGeneralTotalAnticipos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalAnticipos");
    private final static QName _FacturaGeneralMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "moneda");
    private final static QName _FacturaGeneralTotalCargosAplicados_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalCargosAplicados");
    private final static QName _FacturaGeneralTotalMonto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalMonto");
    private final static QName _FacturaGeneralTotalBrutoConImpuesto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalBrutoConImpuesto");
    private final static QName _FacturaGeneralEntregaMercancia_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "entregaMercancia");
    private final static QName _FacturaGeneralFechaEmision_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaEmision");
    private final static QName _FacturaGeneralFechaPagoImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaPagoImpuestos");
    private final static QName _FacturaGeneralTasaDeCambioAlternativa_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tasaDeCambioAlternativa");
    private final static QName _FacturaGeneralTipoSector_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoSector");
    private final static QName _FacturaGeneralTotalBaseImponible_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalBaseImponible");
    private final static QName _FacturaGeneralOrdenDeCompra_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ordenDeCompra");
    private final static QName _FacturaGeneralImpuestosGenerales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "impuestosGenerales");
    private final static QName _FacturaGeneralAutorizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "autorizado");
    private final static QName _FacturaGeneralFechaVencimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaVencimiento");
    private final static QName _FacturaGeneralCantidadDecimales_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cantidadDecimales");
    private final static QName _FacturaGeneralFechaInicioPeriodoFacturacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaInicioPeriodoFacturacion");
    private final static QName _FacturaGeneralRangoNumeracion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "rangoNumeracion");
    private final static QName _FacturaGeneralTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoOperacion");
    private final static QName _FacturaGeneralDetalleDeFactura_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "detalleDeFactura");
    private final static QName _FacturaGeneralTotalSinImpuestos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalSinImpuestos");
    private final static QName _FacturaGeneralSectorSalud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "sectorSalud");
    private final static QName _FacturaGeneralMediosDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mediosDePago");
    private final static QName _FacturaGeneralCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cliente");
    private final static QName _FacturaGeneralTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoDocumento");
    private final static QName _FacturaGeneralFechaFinPeriodoFacturacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaFinPeriodoFacturacion");
    private final static QName _FacturaGeneralTerminosEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "terminosEntrega");
    private final static QName _FacturaGeneralTotalDescuentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "totalDescuentos");
    private final static QName _EnviarResponseEnviarResult_QNAME = new QName("http://tempuri.org/", "EnviarResult");
    private final static QName _DocumentStatusResponseReglasValidacionDIAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "reglasValidacionDIAN");
    private final static QName _DocumentStatusResponseFechaAceptacionDIAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "fechaAceptacionDIAN");
    private final static QName _DocumentStatusResponseFechaDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "fechaDocumento");
    private final static QName _DocumentStatusResponseDescripcionEstatusDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "descripcionEstatusDocumento");
    private final static QName _DocumentStatusResponseAcuseComentario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "acuseComentario");
    private final static QName _DocumentStatusResponseConsecutivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "consecutivo");
    private final static QName _DocumentStatusResponseTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "tipoDocumento");
    private final static QName _DocumentStatusResponseAcuseRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "acuseRespuesta");
    private final static QName _DocumentStatusResponseDescripcionDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "descripcionDocumento");
    private final static QName _DocumentStatusResponseAcuseEstatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "acuseEstatus");
    private final static QName _DocumentStatusResponseAcuseResponsable_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "acuseResponsable");
    private final static QName _DocumentStatusResponseCadenaCufe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "cadenaCufe");
    private final static QName _DocumentStatusResponseCadenaCodigoQR_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "cadenaCodigoQR");
    private final static QName _DocumentStatusResponseEventos_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "eventos");
    private final static QName _DocumentStatusResponseMensajeDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensajeDocumento");
    private final static QName _DocumentStatusResponseAmbiente_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "ambiente");
    private final static QName _DocumentStatusResponseTrackID_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "trackID");
    private final static QName _DocumentStatusResponseHistorialDeEntregas_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "historialDeEntregas");
    private final static QName _DocumentStatusResponseEntregaMetodoDIAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "entregaMetodoDIAN");
    private final static QName _DestinatarioMensajePersonalizado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "mensajePersonalizado");
    private final static QName _DestinatarioCanalDeEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "canalDeEntrega");
    private final static QName _DestinatarioFechaProgramada_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaProgramada");
    private final static QName _DestinatarioNitProveedorReceptor_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nitProveedorReceptor");
    private final static QName _DocumentResponseXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "xml");
    private final static QName _DocumentResponseMensajesValidacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "mensajesValidacion");
    private final static QName _DocumentResponseNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "nombre");
    private final static QName _DocumentResponseReglasNotificacionDIAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "reglasNotificacionDIAN");
    private final static QName _DocumentResponseConsecutivoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "consecutivoDocumento");
    private final static QName _DocumentResponseQr_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "qr");
    private final static QName _EventoFechaEmision_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "fechaEmision");
    private final static QName _EventoComentario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "comentario");
    private final static QName _EventoCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "codigo");
    private final static QName _EventoResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "resultado");
    private final static QName _EventoAmbienteDIAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "ambienteDIAN");
    private final static QName _EventoMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "mensaje");
    private final static QName _EventoEmisorRazonSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "emisorRazonSocial");
    private final static QName _EventoReceptorRazonSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "receptorRazonSocial");
    private final static QName _EventoHash_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "hash");
    private final static QName _EventoFechaRecepcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "fechaRecepcion");
    private final static QName _EventoEmisorNumeroDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "emisorNumeroDocumento");
    private final static QName _EventoTipoEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "tipoEvento");
    private final static QName _EventoEmisorNumeroDocumentoDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "emisorNumeroDocumentoDV");
    private final static QName _EventoExtras_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "extras");
    private final static QName _EventoVersionUBL_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "versionUBL");
    private final static QName _EventoNombreArchivoXML_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "nombreArchivoXML");
    private final static QName _EventoReceptorNumeroDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "receptorNumeroDocumento");
    private final static QName _EventoNumeroDelEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "numeroDelEvento");
    private final static QName _EventoEmisorTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "emisorTipoIdentificacion");
    private final static QName _EventoCufe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "cufe");
    private final static QName _EventoIdPerfilDIAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "idPerfilDIAN");
    private final static QName _EventoNota_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "nota");
    private final static QName _EventoReceptorNumeroDocumentoDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "receptorNumeroDocumentoDV");
    private final static QName _EventoXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "xml");
    private final static QName _EventoDescripcionEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "descripcionEvento");
    private final static QName _EventoReceptorTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "receptorTipoIdentificacion");
    private final static QName _EventoTipoCufe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", "tipoCufe");
    private final static QName _GenerarContenedorResponseGenerarContenedorResult_QNAME = new QName("http://tempuri.org/", "GenerarContenedorResult");
    private final static QName _EntregaDireccionDespacho_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionDespacho");
    private final static QName _EntregaDatosTransportistas_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "datosTransportistas");
    private final static QName _EntregaFechaEstimada_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaEstimada");
    private final static QName _EntregaFechaSolicitada_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaSolicitada");
    private final static QName _EntregaMatriculaTransporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "matriculaTransporte");
    private final static QName _EntregaIdentificacionTransporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "identificacionTransporte");
    private final static QName _EntregaFechaEfectivaSalida_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaEfectivaSalida");
    private final static QName _EntregaFechaReal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaReal");
    private final static QName _DocumentoReferenciadoCodigoInterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoInterno");
    private final static QName _DocumentoReferenciadoCufeDocReferenciado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "cufeDocReferenciado");
    private final static QName _DocumentoReferenciadoCodigoEstatusDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoEstatusDocumento");
    private final static QName _DocumentoReferenciadoTipoDocumentoCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "tipoDocumentoCodigo");
    private final static QName _DocumentoReferenciadoFechaInicioValidez_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaInicioValidez");
    private final static QName _DocumentoReferenciadoFechaFinValidez_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaFinValidez");
    private final static QName _DocumentoReferenciadoConceptoRecaudo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "conceptoRecaudo");
    private final static QName _TributosCodigoImpuesto_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoImpuesto");
    private final static QName _CondicionDePagoReferenciaAnticipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "referenciaAnticipo");
    private final static QName _CondicionDePagoMontoMulta_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoMulta");
    private final static QName _CondicionDePagoDuracionPeriodoMedida_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "duracionPeriodoMedida");
    private final static QName _CondicionDePagoMontoPenalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoPenalidad");
    private final static QName _CondicionDePagoPeriodoDesde_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "periodoDesde");
    private final static QName _CondicionDePagoPeriodoHasta_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "periodoHasta");
    private final static QName _CondicionDePagoMedioPagoAsociado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "medioPagoAsociado");
    private final static QName _CondicionDePagoIdentificador_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "identificador");
    private final static QName _CondicionDePagoPorcentajePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "porcentajePago");
    private final static QName _CondicionDePagoDuracionPeriodo_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "duracionPeriodo");
    private final static QName _CondicionDePagoPorcentajeDescuento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "porcentajeDescuento");
    private final static QName _HistorialDeEntregaLeidoEstatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LeidoEstatus");
    private final static QName _HistorialDeEntregaEntregaEstatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "entregaEstatus");
    private final static QName _HistorialDeEntregaRecepcionEmailIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "recepcionEmailIPAddress");
    private final static QName _HistorialDeEntregaLeidoFecha_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LeidoFecha");
    private final static QName _HistorialDeEntregaLeidoEmailIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "LeidoEmailIPAddress");
    private final static QName _HistorialDeEntregaEntregaEstatusDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "entregaEstatusDescripcion");
    private final static QName _HistorialDeEntregaEntregaFecha_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "entregaFecha");
    private final static QName _HistorialDeEntregaRecepcionEmailEstatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "recepcionEmailEstatus");
    private final static QName _HistorialDeEntregaRecepcionEmailComentario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "recepcionEmailComentario");
    private final static QName _HistorialDeEntregaRecepcionEmailFecha_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "recepcionEmailFecha");
    private final static QName _DescargaPDFResponseDescargaPDFResult_QNAME = new QName("http://tempuri.org/", "DescargaPDFResult");
    private final static QName _ObligacionesRegimen_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "regimen");
    private final static QName _ObligacionesObligaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "obligaciones");
    private final static QName _EnviarFactura_QNAME = new QName("http://tempuri.org/", "factura");
    private final static QName _DatosDelTransportistaTransportadorNumeroDocumentoDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorNumeroDocumentoDV");
    private final static QName _DatosDelTransportistaDireccionResponsableEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "direccionResponsableEntrega");
    private final static QName _DatosDelTransportistaTransportadorNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorNombre");
    private final static QName _DatosDelTransportistaTransportadorTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorTipoIdentificacion");
    private final static QName _DatosDelTransportistaTransportadorDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorDireccion");
    private final static QName _DatosDelTransportistaIndicadordeCuidado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicadordeCuidado");
    private final static QName _DatosDelTransportistaIndicadordeAtencion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "indicadordeAtencion");
    private final static QName _DatosDelTransportistaTransportadorNumeroDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "transportadorNumeroDocumento");
    private final static QName _DatosDelTransportistaNombreResponsableEntrega_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreResponsableEntrega");
    private final static QName _CoordenadasMinutosLongitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "minutosLongitud");
    private final static QName _CoordenadasOrientacionLongitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "orientacionLongitud");
    private final static QName _CoordenadasOrientacionLatitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "orientacionLatitud");
    private final static QName _CoordenadasGradosLatitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "gradosLatitud");
    private final static QName _CoordenadasGradosLongitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "gradosLongitud");
    private final static QName _CoordenadasMinutosLatitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "minutosLatitud");
    private final static QName _DireccionCalleAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "calleAdicional");
    private final static QName _DireccionCorreccionHusoHorario_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "correccionHusoHorario");
    private final static QName _DireccionACuidadoDe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "aCuidadoDe");
    private final static QName _DireccionUbicacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ubicacion");
    private final static QName _DireccionBloque_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "bloque");
    private final static QName _DireccionNumeroParcela_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroParcela");
    private final static QName _DireccionLocalizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "localizacion");
    private final static QName _DireccionSubDivision_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "subDivision");
    private final static QName _DireccionLenguaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "lenguaje");
    private final static QName _DireccionZonaPostal_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "zonaPostal");
    private final static QName _DireccionHabitacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "habitacion");
    private final static QName _DireccionPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "pais");
    private final static QName _DireccionCalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "calle");
    private final static QName _DireccionDepartamentoOrg_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "departamentoOrg");
    private final static QName _DireccionMunicipio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "municipio");
    private final static QName _DireccionDistrito_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "distrito");
    private final static QName _DireccionPiso_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "piso");
    private final static QName _DireccionCodigoDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "codigoDepartamento");
    private final static QName _DireccionRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "region");
    private final static QName _DireccionALaAtencionDe_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "aLaAtencionDe");
    private final static QName _DireccionDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "departamento");
    private final static QName _DireccionNombreEdificio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "nombreEdificio");
    private final static QName _DireccionBuzon_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "buzon");
    private final static QName _DireccionCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "ciudad");
    private final static QName _DireccionNumeroEdificio_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "numeroEdificio");
    private final static QName _EventoResponseConsecutivoDocumentoEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "consecutivoDocumentoEvento");
    private final static QName _FoliosRestantesResponseFoliosRestantesResult_QNAME = new QName("http://tempuri.org/", "FoliosRestantesResult");
    private final static QName _ContenedorResponseContenedorXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "contenedorXml");
    private final static QName _ContenedorResponseFecha_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", "fecha");
    private final static QName _EnvioCorreoResponseEnvioCorreoResult_QNAME = new QName("http://tempuri.org/", "EnvioCorreoResult");
    private final static QName _AnticiposId_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "id");
    private final static QName _AnticiposMontoPagado_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "montoPagado");
    private final static QName _AnticiposFechadePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechadePago");
    private final static QName _AnticiposFechaDeRecibido_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "fechaDeRecibido");
    private final static QName _AnticiposInstrucciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "instrucciones");
    private final static QName _AnticiposHoraDePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", "horaDePago");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mycompany.mavenproject1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DescargaPDFResponse }
     * 
     */
    public DescargaPDFResponse createDescargaPDFResponse() {
        return new DescargaPDFResponse();
    }

    /**
     * Create an instance of {@link DownloadPDFResponse }
     * 
     */
    public DownloadPDFResponse createDownloadPDFResponse() {
        return new DownloadPDFResponse();
    }

    /**
     * Create an instance of {@link CargarCertificadoResponse }
     * 
     */
    public CargarCertificadoResponse createCargarCertificadoResponse() {
        return new CargarCertificadoResponse();
    }

    /**
     * Create an instance of {@link LoadCertificateResponse }
     * 
     */
    public LoadCertificateResponse createLoadCertificateResponse() {
        return new LoadCertificateResponse();
    }

    /**
     * Create an instance of {@link GenerarContenedorResponse }
     * 
     */
    public GenerarContenedorResponse createGenerarContenedorResponse() {
        return new GenerarContenedorResponse();
    }

    /**
     * Create an instance of {@link ContenedorResponse }
     * 
     */
    public ContenedorResponse createContenedorResponse() {
        return new ContenedorResponse();
    }

    /**
     * Create an instance of {@link GenerarEvento }
     * 
     */
    public GenerarEvento createGenerarEvento() {
        return new GenerarEvento();
    }

    /**
     * Create an instance of {@link DatosEvento }
     * 
     */
    public DatosEvento createDatosEvento() {
        return new DatosEvento();
    }

    /**
     * Create an instance of {@link GenerarContenedor }
     * 
     */
    public GenerarContenedor createGenerarContenedor() {
        return new GenerarContenedor();
    }

    /**
     * Create an instance of {@link EnviarResponse }
     * 
     */
    public EnviarResponse createEnviarResponse() {
        return new EnviarResponse();
    }

    /**
     * Create an instance of {@link DocumentResponse }
     * 
     */
    public DocumentResponse createDocumentResponse() {
        return new DocumentResponse();
    }

    /**
     * Create an instance of {@link Enviar }
     * 
     */
    public Enviar createEnviar() {
        return new Enviar();
    }

    /**
     * Create an instance of {@link FacturaGeneral }
     * 
     */
    public FacturaGeneral createFacturaGeneral() {
        return new FacturaGeneral();
    }

    /**
     * Create an instance of {@link EnvioCorreoResponse }
     * 
     */
    public EnvioCorreoResponse createEnvioCorreoResponse() {
        return new EnvioCorreoResponse();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link EstadoDocumentoResponse }
     * 
     */
    public EstadoDocumentoResponse createEstadoDocumentoResponse() {
        return new EstadoDocumentoResponse();
    }

    /**
     * Create an instance of {@link DocumentStatusResponse }
     * 
     */
    public DocumentStatusResponse createDocumentStatusResponse() {
        return new DocumentStatusResponse();
    }

    /**
     * Create an instance of {@link DescargaXMLResponse }
     * 
     */
    public DescargaXMLResponse createDescargaXMLResponse() {
        return new DescargaXMLResponse();
    }

    /**
     * Create an instance of {@link DownloadXMLResponse }
     * 
     */
    public DownloadXMLResponse createDownloadXMLResponse() {
        return new DownloadXMLResponse();
    }

    /**
     * Create an instance of {@link GenerarEventoResponse }
     * 
     */
    public GenerarEventoResponse createGenerarEventoResponse() {
        return new GenerarEventoResponse();
    }

    /**
     * Create an instance of {@link EventoResponse }
     * 
     */
    public EventoResponse createEventoResponse() {
        return new EventoResponse();
    }

    /**
     * Create an instance of {@link DescargaXML }
     * 
     */
    public DescargaXML createDescargaXML() {
        return new DescargaXML();
    }

    /**
     * Create an instance of {@link DescargarEventoXML }
     * 
     */
    public DescargarEventoXML createDescargarEventoXML() {
        return new DescargarEventoXML();
    }

    /**
     * Create an instance of {@link FoliosRestantes }
     * 
     */
    public FoliosRestantes createFoliosRestantes() {
        return new FoliosRestantes();
    }

    /**
     * Create an instance of {@link CargarCertificado }
     * 
     */
    public CargarCertificado createCargarCertificado() {
        return new CargarCertificado();
    }

    /**
     * Create an instance of {@link DescargarEventoXMLResponse }
     * 
     */
    public DescargarEventoXMLResponse createDescargarEventoXMLResponse() {
        return new DescargarEventoXMLResponse();
    }

    /**
     * Create an instance of {@link DescargarEventoResponse }
     * 
     */
    public DescargarEventoResponse createDescargarEventoResponse() {
        return new DescargarEventoResponse();
    }

    /**
     * Create an instance of {@link EnvioCorreo }
     * 
     */
    public EnvioCorreo createEnvioCorreo() {
        return new EnvioCorreo();
    }

    /**
     * Create an instance of {@link EstadoDocumento }
     * 
     */
    public EstadoDocumento createEstadoDocumento() {
        return new EstadoDocumento();
    }

    /**
     * Create an instance of {@link DescargaPDF }
     * 
     */
    public DescargaPDF createDescargaPDF() {
        return new DescargaPDF();
    }

    /**
     * Create an instance of {@link FoliosRestantesResponse }
     * 
     */
    public FoliosRestantesResponse createFoliosRestantesResponse() {
        return new FoliosRestantesResponse();
    }

    /**
     * Create an instance of {@link FoliosRemainingResponse }
     * 
     */
    public FoliosRemainingResponse createFoliosRemainingResponse() {
        return new FoliosRemainingResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentoReferenciado }
     * 
     */
    public ArrayOfDocumentoReferenciado createArrayOfDocumentoReferenciado() {
        return new ArrayOfDocumentoReferenciado();
    }

    /**
     * Create an instance of {@link ArrayOfObligaciones }
     * 
     */
    public ArrayOfObligaciones createArrayOfObligaciones() {
        return new ArrayOfObligaciones();
    }

    /**
     * Create an instance of {@link ArrayOfFacturaImpuestos }
     * 
     */
    public ArrayOfFacturaImpuestos createArrayOfFacturaImpuestos() {
        return new ArrayOfFacturaImpuestos();
    }

    /**
     * Create an instance of {@link Extras }
     * 
     */
    public Extras createExtras() {
        return new Extras();
    }

    /**
     * Create an instance of {@link ArrayOfLineaInformacionAdicional }
     * 
     */
    public ArrayOfLineaInformacionAdicional createArrayOfLineaInformacionAdicional() {
        return new ArrayOfLineaInformacionAdicional();
    }

    /**
     * Create an instance of {@link ImpuestosTotales }
     * 
     */
    public ImpuestosTotales createImpuestosTotales() {
        return new ImpuestosTotales();
    }

    /**
     * Create an instance of {@link Obligaciones }
     * 
     */
    public Obligaciones createObligaciones() {
        return new Obligaciones();
    }

    /**
     * Create an instance of {@link TasaDeCambio }
     * 
     */
    public TasaDeCambio createTasaDeCambio() {
        return new TasaDeCambio();
    }

    /**
     * Create an instance of {@link ArrayOfCoordenadas }
     * 
     */
    public ArrayOfCoordenadas createArrayOfCoordenadas() {
        return new ArrayOfCoordenadas();
    }

    /**
     * Create an instance of {@link LineaInformacionAdicional }
     * 
     */
    public LineaInformacionAdicional createLineaInformacionAdicional() {
        return new LineaInformacionAdicional();
    }

    /**
     * Create an instance of {@link Direccion }
     * 
     */
    public Direccion createDireccion() {
        return new Direccion();
    }

    /**
     * Create an instance of {@link ArrayOfCondicionDePago }
     * 
     */
    public ArrayOfCondicionDePago createArrayOfCondicionDePago() {
        return new ArrayOfCondicionDePago();
    }

    /**
     * Create an instance of {@link DocumentoReferenciado }
     * 
     */
    public DocumentoReferenciado createDocumentoReferenciado() {
        return new DocumentoReferenciado();
    }

    /**
     * Create an instance of {@link GeneralSalud }
     * 
     */
    public GeneralSalud createGeneralSalud() {
        return new GeneralSalud();
    }

    /**
     * Create an instance of {@link HistorialDeEntrega }
     * 
     */
    public HistorialDeEntrega createHistorialDeEntrega() {
        return new HistorialDeEntrega();
    }

    /**
     * Create an instance of {@link OrdenDeCompra }
     * 
     */
    public OrdenDeCompra createOrdenDeCompra() {
        return new OrdenDeCompra();
    }

    /**
     * Create an instance of {@link TerminosDeEntrega }
     * 
     */
    public TerminosDeEntrega createTerminosDeEntrega() {
        return new TerminosDeEntrega();
    }

    /**
     * Create an instance of {@link ArrayOfExtensible }
     * 
     */
    public ArrayOfExtensible createArrayOfExtensible() {
        return new ArrayOfExtensible();
    }

    /**
     * Create an instance of {@link Anticipos }
     * 
     */
    public Anticipos createAnticipos() {
        return new Anticipos();
    }

    /**
     * Create an instance of {@link ArrayOfDestinatario }
     * 
     */
    public ArrayOfDestinatario createArrayOfDestinatario() {
        return new ArrayOfDestinatario();
    }

    /**
     * Create an instance of {@link DatosDelTransportista }
     * 
     */
    public DatosDelTransportista createDatosDelTransportista() {
        return new DatosDelTransportista();
    }

    /**
     * Create an instance of {@link ArrayOfTributos }
     * 
     */
    public ArrayOfTributos createArrayOfTributos() {
        return new ArrayOfTributos();
    }

    /**
     * Create an instance of {@link Destinatario }
     * 
     */
    public Destinatario createDestinatario() {
        return new Destinatario();
    }

    /**
     * Create an instance of {@link ArrayOfFacturaDetalle }
     * 
     */
    public ArrayOfFacturaDetalle createArrayOfFacturaDetalle() {
        return new ArrayOfFacturaDetalle();
    }

    /**
     * Create an instance of {@link SectorSalud }
     * 
     */
    public SectorSalud createSectorSalud() {
        return new SectorSalud();
    }

    /**
     * Create an instance of {@link BeneficiarioSalud }
     * 
     */
    public BeneficiarioSalud createBeneficiarioSalud() {
        return new BeneficiarioSalud();
    }

    /**
     * Create an instance of {@link TasaDeCambioAlternativa }
     * 
     */
    public TasaDeCambioAlternativa createTasaDeCambioAlternativa() {
        return new TasaDeCambioAlternativa();
    }

    /**
     * Create an instance of {@link ArrayOfDatosPacienteSalud }
     * 
     */
    public ArrayOfDatosPacienteSalud createArrayOfDatosPacienteSalud() {
        return new ArrayOfDatosPacienteSalud();
    }

    /**
     * Create an instance of {@link Entrega }
     * 
     */
    public Entrega createEntrega() {
        return new Entrega();
    }

    /**
     * Create an instance of {@link MediosDePago }
     * 
     */
    public MediosDePago createMediosDePago() {
        return new MediosDePago();
    }

    /**
     * Create an instance of {@link ArrayOfAnticipos }
     * 
     */
    public ArrayOfAnticipos createArrayOfAnticipos() {
        return new ArrayOfAnticipos();
    }

    /**
     * Create an instance of {@link ArrayOfCargosDescuentos }
     * 
     */
    public ArrayOfCargosDescuentos createArrayOfCargosDescuentos() {
        return new ArrayOfCargosDescuentos();
    }

    /**
     * Create an instance of {@link Tributos }
     * 
     */
    public Tributos createTributos() {
        return new Tributos();
    }

    /**
     * Create an instance of {@link ArrayOfImpuestosTotales }
     * 
     */
    public ArrayOfImpuestosTotales createArrayOfImpuestosTotales() {
        return new ArrayOfImpuestosTotales();
    }

    /**
     * Create an instance of {@link DatosPacienteSalud }
     * 
     */
    public DatosPacienteSalud createDatosPacienteSalud() {
        return new DatosPacienteSalud();
    }

    /**
     * Create an instance of {@link CondicionDePago }
     * 
     */
    public CondicionDePago createCondicionDePago() {
        return new CondicionDePago();
    }

    /**
     * Create an instance of {@link ArrayOfMediosDePago }
     * 
     */
    public ArrayOfMediosDePago createArrayOfMediosDePago() {
        return new ArrayOfMediosDePago();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ArrayOfExtras }
     * 
     */
    public ArrayOfExtras createArrayOfExtras() {
        return new ArrayOfExtras();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenDeCompra }
     * 
     */
    public ArrayOfOrdenDeCompra createArrayOfOrdenDeCompra() {
        return new ArrayOfOrdenDeCompra();
    }

    /**
     * Create an instance of {@link Extensible }
     * 
     */
    public Extensible createExtensible() {
        return new Extensible();
    }

    /**
     * Create an instance of {@link FacturaImpuestos }
     * 
     */
    public FacturaImpuestos createFacturaImpuestos() {
        return new FacturaImpuestos();
    }

    /**
     * Create an instance of {@link CargosDescuentos }
     * 
     */
    public CargosDescuentos createCargosDescuentos() {
        return new CargosDescuentos();
    }

    /**
     * Create an instance of {@link Autorizado }
     * 
     */
    public Autorizado createAutorizado() {
        return new Autorizado();
    }

    /**
     * Create an instance of {@link ArrayOfDatosExtras }
     * 
     */
    public ArrayOfDatosExtras createArrayOfDatosExtras() {
        return new ArrayOfDatosExtras();
    }

    /**
     * Create an instance of {@link DatosExtras }
     * 
     */
    public DatosExtras createDatosExtras() {
        return new DatosExtras();
    }

    /**
     * Create an instance of {@link InformacionLegal }
     * 
     */
    public InformacionLegal createInformacionLegal() {
        return new InformacionLegal();
    }

    /**
     * Create an instance of {@link ArrayOfGeneralSalud }
     * 
     */
    public ArrayOfGeneralSalud createArrayOfGeneralSalud() {
        return new ArrayOfGeneralSalud();
    }

    /**
     * Create an instance of {@link FacturaDetalle }
     * 
     */
    public FacturaDetalle createFacturaDetalle() {
        return new FacturaDetalle();
    }

    /**
     * Create an instance of {@link ArrayOfHistorialDeEntrega }
     * 
     */
    public ArrayOfHistorialDeEntrega createArrayOfHistorialDeEntrega() {
        return new ArrayOfHistorialDeEntrega();
    }

    /**
     * Create an instance of {@link Coordenadas }
     * 
     */
    public Coordenadas createCoordenadas() {
        return new Coordenadas();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfExtrasEvento }
     * 
     */
    public ArrayOfExtrasEvento createArrayOfExtrasEvento() {
        return new ArrayOfExtrasEvento();
    }

    /**
     * Create an instance of {@link Evento }
     * 
     */
    public Evento createEvento() {
        return new Evento();
    }

    /**
     * Create an instance of {@link ExtrasEvento }
     * 
     */
    public ExtrasEvento createExtrasEvento() {
        return new ExtrasEvento();
    }

    /**
     * Create an instance of {@link ArrayOfEvento }
     * 
     */
    public ArrayOfEvento createArrayOfEvento() {
        return new ArrayOfEvento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfCargosDescuentos")
    public JAXBElement<ArrayOfCargosDescuentos> createArrayOfCargosDescuentos(ArrayOfCargosDescuentos value) {
        return new JAXBElement<ArrayOfCargosDescuentos>(_ArrayOfCargosDescuentos_QNAME, ArrayOfCargosDescuentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tributos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Tributos")
    public JAXBElement<Tributos> createTributos(Tributos value) {
        return new JAXBElement<Tributos>(_Tributos_QNAME, Tributos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnticipos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfAnticipos")
    public JAXBElement<ArrayOfAnticipos> createArrayOfAnticipos(ArrayOfAnticipos value) {
        return new JAXBElement<ArrayOfAnticipos>(_ArrayOfAnticipos_QNAME, ArrayOfAnticipos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosPacienteSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDatosPacienteSalud")
    public JAXBElement<ArrayOfDatosPacienteSalud> createArrayOfDatosPacienteSalud(ArrayOfDatosPacienteSalud value) {
        return new JAXBElement<ArrayOfDatosPacienteSalud>(_ArrayOfDatosPacienteSalud_QNAME, ArrayOfDatosPacienteSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DocumentStatusResponse")
    public JAXBElement<DocumentStatusResponse> createDocumentStatusResponse(DocumentStatusResponse value) {
        return new JAXBElement<DocumentStatusResponse>(_DocumentStatusResponse_QNAME, DocumentStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Entrega")
    public JAXBElement<Entrega> createEntrega(Entrega value) {
        return new JAXBElement<Entrega>(_Entrega_QNAME, Entrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediosDePago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "MediosDePago")
    public JAXBElement<MediosDePago> createMediosDePago(MediosDePago value) {
        return new JAXBElement<MediosDePago>(_MediosDePago_QNAME, MediosDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediosDePago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfMediosDePago")
    public JAXBElement<ArrayOfMediosDePago> createArrayOfMediosDePago(ArrayOfMediosDePago value) {
        return new JAXBElement<ArrayOfMediosDePago>(_ArrayOfMediosDePago_QNAME, ArrayOfMediosDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfExtras")
    public JAXBElement<ArrayOfExtras> createArrayOfExtras(ArrayOfExtras value) {
        return new JAXBElement<ArrayOfExtras>(_ArrayOfExtras_QNAME, ArrayOfExtras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtrasEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ExtrasEvento")
    public JAXBElement<ExtrasEvento> createExtrasEvento(ExtrasEvento value) {
        return new JAXBElement<ExtrasEvento>(_ExtrasEvento_QNAME, ExtrasEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosPacienteSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosPacienteSalud")
    public JAXBElement<DatosPacienteSalud> createDatosPacienteSalud(DatosPacienteSalud value) {
        return new JAXBElement<DatosPacienteSalud>(_DatosPacienteSalud_QNAME, DatosPacienteSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CondicionDePago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "CondicionDePago")
    public JAXBElement<CondicionDePago> createCondicionDePago(CondicionDePago value) {
        return new JAXBElement<CondicionDePago>(_CondicionDePago_QNAME, CondicionDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfImpuestosTotales")
    public JAXBElement<ArrayOfImpuestosTotales> createArrayOfImpuestosTotales(ArrayOfImpuestosTotales value) {
        return new JAXBElement<ArrayOfImpuestosTotales>(_ArrayOfImpuestosTotales_QNAME, ArrayOfImpuestosTotales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeneralSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfGeneralSalud")
    public JAXBElement<ArrayOfGeneralSalud> createArrayOfGeneralSalud(ArrayOfGeneralSalud value) {
        return new JAXBElement<ArrayOfGeneralSalud>(_ArrayOfGeneralSalud_QNAME, ArrayOfGeneralSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autorizado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Autorizado")
    public JAXBElement<Autorizado> createAutorizado(Autorizado value) {
        return new JAXBElement<Autorizado>(_Autorizado_QNAME, Autorizado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosExtras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDatosExtras")
    public JAXBElement<ArrayOfDatosExtras> createArrayOfDatosExtras(ArrayOfDatosExtras value) {
        return new JAXBElement<ArrayOfDatosExtras>(_ArrayOfDatosExtras_QNAME, ArrayOfDatosExtras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargosDescuentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "CargosDescuentos")
    public JAXBElement<CargosDescuentos> createCargosDescuentos(CargosDescuentos value) {
        return new JAXBElement<CargosDescuentos>(_CargosDescuentos_QNAME, CargosDescuentos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionLegal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "InformacionLegal")
    public JAXBElement<InformacionLegal> createInformacionLegal(InformacionLegal value) {
        return new JAXBElement<InformacionLegal>(_InformacionLegal_QNAME, InformacionLegal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosExtras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosExtras")
    public JAXBElement<DatosExtras> createDatosExtras(DatosExtras value) {
        return new JAXBElement<DatosExtras>(_DatosExtras_QNAME, DatosExtras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaImpuestos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "FacturaImpuestos")
    public JAXBElement<FacturaImpuestos> createFacturaImpuestos(FacturaImpuestos value) {
        return new JAXBElement<FacturaImpuestos>(_FacturaImpuestos_QNAME, FacturaImpuestos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Extensible")
    public JAXBElement<Extensible> createExtensible(Extensible value) {
        return new JAXBElement<Extensible>(_Extensible_QNAME, Extensible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenDeCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfOrdenDeCompra")
    public JAXBElement<ArrayOfOrdenDeCompra> createArrayOfOrdenDeCompra(ArrayOfOrdenDeCompra value) {
        return new JAXBElement<ArrayOfOrdenDeCompra>(_ArrayOfOrdenDeCompra_QNAME, ArrayOfOrdenDeCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "Evento")
    public JAXBElement<Evento> createEvento(Evento value) {
        return new JAXBElement<Evento>(_Evento_QNAME, Evento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialDeEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfHistorialDeEntrega")
    public JAXBElement<ArrayOfHistorialDeEntrega> createArrayOfHistorialDeEntrega(ArrayOfHistorialDeEntrega value) {
        return new JAXBElement<ArrayOfHistorialDeEntrega>(_ArrayOfHistorialDeEntrega_QNAME, ArrayOfHistorialDeEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Coordenadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Coordenadas")
    public JAXBElement<Coordenadas> createCoordenadas(Coordenadas value) {
        return new JAXBElement<Coordenadas>(_Coordenadas_QNAME, Coordenadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaDetalle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "FacturaDetalle")
    public JAXBElement<FacturaDetalle> createFacturaDetalle(FacturaDetalle value) {
        return new JAXBElement<FacturaDetalle>(_FacturaDetalle_QNAME, FacturaDetalle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaInformacionAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfLineaInformacionAdicional")
    public JAXBElement<ArrayOfLineaInformacionAdicional> createArrayOfLineaInformacionAdicional(ArrayOfLineaInformacionAdicional value) {
        return new JAXBElement<ArrayOfLineaInformacionAdicional>(_ArrayOfLineaInformacionAdicional_QNAME, ArrayOfLineaInformacionAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoliosRemainingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "FoliosRemainingResponse")
    public JAXBElement<FoliosRemainingResponse> createFoliosRemainingResponse(FoliosRemainingResponse value) {
        return new JAXBElement<FoliosRemainingResponse>(_FoliosRemainingResponse_QNAME, FoliosRemainingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Extras")
    public JAXBElement<Extras> createExtras(Extras value) {
        return new JAXBElement<Extras>(_Extras_QNAME, Extras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ArrayOfEvento")
    public JAXBElement<ArrayOfEvento> createArrayOfEvento(ArrayOfEvento value) {
        return new JAXBElement<ArrayOfEvento>(_ArrayOfEvento_QNAME, ArrayOfEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfObligaciones")
    public JAXBElement<ArrayOfObligaciones> createArrayOfObligaciones(ArrayOfObligaciones value) {
        return new JAXBElement<ArrayOfObligaciones>(_ArrayOfObligaciones_QNAME, ArrayOfObligaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfFacturaImpuestos")
    public JAXBElement<ArrayOfFacturaImpuestos> createArrayOfFacturaImpuestos(ArrayOfFacturaImpuestos value) {
        return new JAXBElement<ArrayOfFacturaImpuestos>(_ArrayOfFacturaImpuestos_QNAME, ArrayOfFacturaImpuestos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDocumentoReferenciado")
    public JAXBElement<ArrayOfDocumentoReferenciado> createArrayOfDocumentoReferenciado(ArrayOfDocumentoReferenciado value) {
        return new JAXBElement<ArrayOfDocumentoReferenciado>(_ArrayOfDocumentoReferenciado_QNAME, ArrayOfDocumentoReferenciado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosEvento")
    public JAXBElement<DatosEvento> createDatosEvento(DatosEvento value) {
        return new JAXBElement<DatosEvento>(_DatosEvento_QNAME, DatosEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DownloadXMLResponse")
    public JAXBElement<DownloadXMLResponse> createDownloadXMLResponse(DownloadXMLResponse value) {
        return new JAXBElement<DownloadXMLResponse>(_DownloadXMLResponse_QNAME, DownloadXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarEventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DescargarEventoResponse")
    public JAXBElement<DescargarEventoResponse> createDescargarEventoResponse(DescargarEventoResponse value) {
        return new JAXBElement<DescargarEventoResponse>(_DescargarEventoResponse_QNAME, DescargarEventoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "FacturaGeneral")
    public JAXBElement<FacturaGeneral> createFacturaGeneral(FacturaGeneral value) {
        return new JAXBElement<FacturaGeneral>(_FacturaGeneral_QNAME, FacturaGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoReferenciado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DocumentoReferenciado")
    public JAXBElement<DocumentoReferenciado> createDocumentoReferenciado(DocumentoReferenciado value) {
        return new JAXBElement<DocumentoReferenciado>(_DocumentoReferenciado_QNAME, DocumentoReferenciado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "GeneralSalud")
    public JAXBElement<GeneralSalud> createGeneralSalud(GeneralSalud value) {
        return new JAXBElement<GeneralSalud>(_GeneralSalud_QNAME, GeneralSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineaInformacionAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "LineaInformacionAdicional")
    public JAXBElement<LineaInformacionAdicional> createLineaInformacionAdicional(LineaInformacionAdicional value) {
        return new JAXBElement<LineaInformacionAdicional>(_LineaInformacionAdicional_QNAME, LineaInformacionAdicional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoordenadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfCoordenadas")
    public JAXBElement<ArrayOfCoordenadas> createArrayOfCoordenadas(ArrayOfCoordenadas value) {
        return new JAXBElement<ArrayOfCoordenadas>(_ArrayOfCoordenadas_QNAME, ArrayOfCoordenadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Direccion")
    public JAXBElement<Direccion> createDireccion(Direccion value) {
        return new JAXBElement<Direccion>(_Direccion_QNAME, Direccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCondicionDePago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfCondicionDePago")
    public JAXBElement<ArrayOfCondicionDePago> createArrayOfCondicionDePago(ArrayOfCondicionDePago value) {
        return new JAXBElement<ArrayOfCondicionDePago>(_ArrayOfCondicionDePago_QNAME, ArrayOfCondicionDePago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TasaDeCambio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TasaDeCambio")
    public JAXBElement<TasaDeCambio> createTasaDeCambio(TasaDeCambio value) {
        return new JAXBElement<TasaDeCambio>(_TasaDeCambio_QNAME, TasaDeCambio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DownloadPDFResponse")
    public JAXBElement<DownloadPDFResponse> createDownloadPDFResponse(DownloadPDFResponse value) {
        return new JAXBElement<DownloadPDFResponse>(_DownloadPDFResponse_QNAME, DownloadPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Obligaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Obligaciones")
    public JAXBElement<Obligaciones> createObligaciones(Obligaciones value) {
        return new JAXBElement<Obligaciones>(_Obligaciones_QNAME, Obligaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImpuestosTotales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ImpuestosTotales")
    public JAXBElement<ImpuestosTotales> createImpuestosTotales(ImpuestosTotales value) {
        return new JAXBElement<ImpuestosTotales>(_ImpuestosTotales_QNAME, ImpuestosTotales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Anticipos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Anticipos")
    public JAXBElement<Anticipos> createAnticipos(Anticipos value) {
        return new JAXBElement<Anticipos>(_Anticipos_QNAME, Anticipos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfDestinatario")
    public JAXBElement<ArrayOfDestinatario> createArrayOfDestinatario(ArrayOfDestinatario value) {
        return new JAXBElement<ArrayOfDestinatario>(_ArrayOfDestinatario_QNAME, ArrayOfDestinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "EventoResponse")
    public JAXBElement<EventoResponse> createEventoResponse(EventoResponse value) {
        return new JAXBElement<EventoResponse>(_EventoResponse_QNAME, EventoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosDelTransportista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DatosDelTransportista")
    public JAXBElement<DatosDelTransportista> createDatosDelTransportista(DatosDelTransportista value) {
        return new JAXBElement<DatosDelTransportista>(_DatosDelTransportista_QNAME, DatosDelTransportista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminosDeEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TerminosDeEntrega")
    public JAXBElement<TerminosDeEntrega> createTerminosDeEntrega(TerminosDeEntrega value) {
        return new JAXBElement<TerminosDeEntrega>(_TerminosDeEntrega_QNAME, TerminosDeEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "DocumentResponse")
    public JAXBElement<DocumentResponse> createDocumentResponse(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_DocumentResponse_QNAME, DocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContenedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "ContenedorResponse")
    public JAXBElement<ContenedorResponse> createContenedorResponse(ContenedorResponse value) {
        return new JAXBElement<ContenedorResponse>(_ContenedorResponse_QNAME, ContenedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfExtensible")
    public JAXBElement<ArrayOfExtensible> createArrayOfExtensible(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_ArrayOfExtensible_QNAME, ArrayOfExtensible.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HistorialDeEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "HistorialDeEntrega")
    public JAXBElement<HistorialDeEntrega> createHistorialDeEntrega(HistorialDeEntrega value) {
        return new JAXBElement<HistorialDeEntrega>(_HistorialDeEntrega_QNAME, HistorialDeEntrega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenDeCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "OrdenDeCompra")
    public JAXBElement<OrdenDeCompra> createOrdenDeCompra(OrdenDeCompra value) {
        return new JAXBElement<OrdenDeCompra>(_OrdenDeCompra_QNAME, OrdenDeCompra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectorSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "SectorSalud")
    public JAXBElement<SectorSalud> createSectorSalud(SectorSalud value) {
        return new JAXBElement<SectorSalud>(_SectorSalud_QNAME, SectorSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TasaDeCambioAlternativa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TasaDeCambioAlternativa")
    public JAXBElement<TasaDeCambioAlternativa> createTasaDeCambioAlternativa(TasaDeCambioAlternativa value) {
        return new JAXBElement<TasaDeCambioAlternativa>(_TasaDeCambioAlternativa_QNAME, TasaDeCambioAlternativa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiarioSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "BeneficiarioSalud")
    public JAXBElement<BeneficiarioSalud> createBeneficiarioSalud(BeneficiarioSalud value) {
        return new JAXBElement<BeneficiarioSalud>(_BeneficiarioSalud_QNAME, BeneficiarioSalud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Destinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Destinatario")
    public JAXBElement<Destinatario> createDestinatario(Destinatario value) {
        return new JAXBElement<Destinatario>(_Destinatario_QNAME, Destinatario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaDetalle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfFacturaDetalle")
    public JAXBElement<ArrayOfFacturaDetalle> createArrayOfFacturaDetalle(ArrayOfFacturaDetalle value) {
        return new JAXBElement<ArrayOfFacturaDetalle>(_ArrayOfFacturaDetalle_QNAME, ArrayOfFacturaDetalle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "SendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ArrayOfTributos")
    public JAXBElement<ArrayOfTributos> createArrayOfTributos(ArrayOfTributos value) {
        return new JAXBElement<ArrayOfTributos>(_ArrayOfTributos_QNAME, ArrayOfTributos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "LoadCertificateResponse")
    public JAXBElement<LoadCertificateResponse> createLoadCertificateResponse(LoadCertificateResponse value) {
        return new JAXBElement<LoadCertificateResponse>(_LoadCertificateResponse_QNAME, LoadCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtrasEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ArrayOfExtrasEvento")
    public JAXBElement<ArrayOfExtrasEvento> createArrayOfExtrasEvento(ArrayOfExtrasEvento value) {
        return new JAXBElement<ArrayOfExtrasEvento>(_ArrayOfExtrasEvento_QNAME, ArrayOfExtrasEvento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "medioPago", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoMedioPago(String value) {
        return new JAXBElement<String>(_MediosDePagoMedioPago_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroDias", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoNumeroDias(String value) {
        return new JAXBElement<String>(_MediosDePagoNumeroDias_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoBanco", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoCodigoBanco(String value) {
        return new JAXBElement<String>(_MediosDePagoCodigoBanco_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoCanalPago", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoCodigoCanalPago(String value) {
        return new JAXBElement<String>(_MediosDePagoCodigoCanalPago_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = MediosDePago.class)
    public JAXBElement<ArrayOfExtensible> createMediosDePagoExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaDeVencimiento", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoFechaDeVencimiento(String value) {
        return new JAXBElement<String>(_MediosDePagoFechaDeVencimiento_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroDeReferencia", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoNumeroDeReferencia(String value) {
        return new JAXBElement<String>(_MediosDePagoNumeroDeReferencia_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoReferencia", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoCodigoReferencia(String value) {
        return new JAXBElement<String>(_MediosDePagoCodigoReferencia_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "metodoDePago", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoMetodoDePago(String value) {
        return new JAXBElement<String>(_MediosDePagoMetodoDePago_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreBanco", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoNombreBanco(String value) {
        return new JAXBElement<String>(_MediosDePagoNombreBanco_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroTransferencia", scope = MediosDePago.class)
    public JAXBElement<String> createMediosDePagoNumeroTransferencia(String value) {
        return new JAXBElement<String>(_MediosDePagoNumeroTransferencia_QNAME, String.class, MediosDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TipoIdentificacion", scope = BeneficiarioSalud.class)
    public JAXBElement<String> createBeneficiarioSaludTipoIdentificacion(String value) {
        return new JAXBElement<String>(_BeneficiarioSaludTipoIdentificacion_QNAME, String.class, BeneficiarioSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "DireccionResidencia", scope = BeneficiarioSalud.class)
    public JAXBElement<Direccion> createBeneficiarioSaludDireccionResidencia(Direccion value) {
        return new JAXBElement<Direccion>(_BeneficiarioSaludDireccionResidencia_QNAME, Direccion.class, BeneficiarioSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "valor", scope = ExtrasEvento.class)
    public JAXBElement<String> createExtrasEventoValor(String value) {
        return new JAXBElement<String>(_ExtrasEventoValor_QNAME, String.class, ExtrasEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "nombre", scope = ExtrasEvento.class)
    public JAXBElement<String> createExtrasEventoNombre(String value) {
        return new JAXBElement<String>(_ExtrasEventoNombre_QNAME, String.class, ExtrasEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "codigoInterno2", scope = ExtrasEvento.class)
    public JAXBElement<String> createExtrasEventoCodigoInterno2(String value) {
        return new JAXBElement<String>(_ExtrasEventoCodigoInterno2_QNAME, String.class, ExtrasEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "codigoInterno1", scope = ExtrasEvento.class)
    public JAXBElement<String> createExtrasEventoCodigoInterno1(String value) {
        return new JAXBElement<String>(_ExtrasEventoCodigoInterno1_QNAME, String.class, ExtrasEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = DescargaXML.class)
    public JAXBElement<String> createDescargaXMLTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, DescargaXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = DescargaXML.class)
    public JAXBElement<String> createDescargaXMLTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, DescargaXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documento", scope = DescargaXML.class)
    public JAXBElement<String> createDescargaXMLDocumento(String value) {
        return new JAXBElement<String>(_DescargaXMLDocumento_QNAME, String.class, DescargaXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Valor", scope = GeneralSalud.class)
    public JAXBElement<String> createGeneralSaludValor(String value) {
        return new JAXBElement<String>(_GeneralSaludValor_QNAME, String.class, GeneralSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Nombre", scope = GeneralSalud.class)
    public JAXBElement<String> createGeneralSaludNombre(String value) {
        return new JAXBElement<String>(_GeneralSaludNombre_QNAME, String.class, GeneralSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EstadoDocumentoResult", scope = EstadoDocumentoResponse.class)
    public JAXBElement<DocumentStatusResponse> createEstadoDocumentoResponseEstadoDocumentoResult(DocumentStatusResponse value) {
        return new JAXBElement<DocumentStatusResponse>(_EstadoDocumentoResponseEstadoDocumentoResult_QNAME, DocumentStatusResponse.class, EstadoDocumentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "correo", scope = EnvioCorreo.class)
    public JAXBElement<String> createEnvioCorreoCorreo(String value) {
        return new JAXBElement<String>(_EnvioCorreoCorreo_QNAME, String.class, EnvioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = EnvioCorreo.class)
    public JAXBElement<String> createEnvioCorreoTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, EnvioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = EnvioCorreo.class)
    public JAXBElement<String> createEnvioCorreoTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, EnvioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documento", scope = EnvioCorreo.class)
    public JAXBElement<String> createEnvioCorreoDocumento(String value) {
        return new JAXBElement<String>(_DescargaXMLDocumento_QNAME, String.class, EnvioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "adjuntos", scope = EnvioCorreo.class)
    public JAXBElement<String> createEnvioCorreoAdjuntos(String value) {
        return new JAXBElement<String>(_EnvioCorreoAdjuntos_QNAME, String.class, EnvioCorreo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DescargaXMLResult", scope = DescargaXMLResponse.class)
    public JAXBElement<DownloadXMLResponse> createDescargaXMLResponseDescargaXMLResult(DownloadXMLResponse value) {
        return new JAXBElement<DownloadXMLResponse>(_DescargaXMLResponseDescargaXMLResult_QNAME, DownloadXMLResponse.class, DescargaXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = FoliosRestantes.class)
    public JAXBElement<String> createFoliosRestantesTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, FoliosRestantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = FoliosRestantes.class)
    public JAXBElement<String> createFoliosRestantesTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, FoliosRestantes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = TerminosDeEntrega.class)
    public JAXBElement<ArrayOfExtensible> createTerminosDeEntregaExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoCondicionEntrega", scope = TerminosDeEntrega.class)
    public JAXBElement<String> createTerminosDeEntregaCodigoCondicionEntrega(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaCodigoCondicionEntrega_QNAME, String.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "costoTransporte", scope = TerminosDeEntrega.class)
    public JAXBElement<String> createTerminosDeEntregaCostoTransporte(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaCostoTransporte_QNAME, String.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "identificacion", scope = TerminosDeEntrega.class)
    public JAXBElement<String> createTerminosDeEntregaIdentificacion(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaIdentificacion_QNAME, String.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cargosDescuentos", scope = TerminosDeEntrega.class)
    public JAXBElement<ArrayOfCargosDescuentos> createTerminosDeEntregaCargosDescuentos(ArrayOfCargosDescuentos value) {
        return new JAXBElement<ArrayOfCargosDescuentos>(_TerminosDeEntregaCargosDescuentos_QNAME, ArrayOfCargosDescuentos.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "responsableEntrega", scope = TerminosDeEntrega.class)
    public JAXBElement<String> createTerminosDeEntregaResponsableEntrega(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaResponsableEntrega_QNAME, String.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monto", scope = TerminosDeEntrega.class)
    public JAXBElement<String> createTerminosDeEntregaMonto(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaMonto_QNAME, String.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccionEntrega", scope = TerminosDeEntrega.class)
    public JAXBElement<Direccion> createTerminosDeEntregaDireccionEntrega(Direccion value) {
        return new JAXBElement<Direccion>(_TerminosDeEntregaDireccionEntrega_QNAME, Direccion.class, TerminosDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosPacienteSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Pacientes", scope = SectorSalud.class)
    public JAXBElement<ArrayOfDatosPacienteSalud> createSectorSaludPacientes(ArrayOfDatosPacienteSalud value) {
        return new JAXBElement<ArrayOfDatosPacienteSalud>(_SectorSaludPacientes_QNAME, ArrayOfDatosPacienteSalud.class, SectorSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "TipoEscenario", scope = SectorSalud.class)
    public JAXBElement<String> createSectorSaludTipoEscenario(String value) {
        return new JAXBElement<String>(_SectorSaludTipoEscenario_QNAME, String.class, SectorSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = SectorSalud.class)
    public JAXBElement<ArrayOfExtras> createSectorSaludExtras(ArrayOfExtras value) {
        return new JAXBElement<ArrayOfExtras>(_MediosDePagoExtras_QNAME, ArrayOfExtras.class, SectorSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiarioSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "Beneficiario", scope = SectorSalud.class)
    public JAXBElement<BeneficiarioSalud> createSectorSaludBeneficiario(BeneficiarioSalud value) {
        return new JAXBElement<BeneficiarioSalud>(_SectorSaludBeneficiario_QNAME, BeneficiarioSalud.class, SectorSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "IdPersonalizacion", scope = SectorSalud.class)
    public JAXBElement<String> createSectorSaludIdPersonalizacion(String value) {
        return new JAXBElement<String>(_SectorSaludIdPersonalizacion_QNAME, String.class, SectorSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadCertificateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CargarCertificadoResult", scope = CargarCertificadoResponse.class)
    public JAXBElement<LoadCertificateResponse> createCargarCertificadoResponseCargarCertificadoResult(LoadCertificateResponse value) {
        return new JAXBElement<LoadCertificateResponse>(_CargarCertificadoResponseCargarCertificadoResult_QNAME, LoadCertificateResponse.class, CargarCertificadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoEstablecimiento", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalCodigoEstablecimiento(String value) {
        return new JAXBElement<String>(_InformacionLegalCodigoEstablecimiento_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroIdentificacionDV", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalNumeroIdentificacionDV(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroIdentificacionDV_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroIdentificacion", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalNumeroIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroIdentificacion_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoIdentificacion", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalTipoIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalTipoIdentificacion_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "prefijoFacturacion", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalPrefijoFacturacion(String value) {
        return new JAXBElement<String>(_InformacionLegalPrefijoFacturacion_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreRegistroRUT", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalNombreRegistroRUT(String value) {
        return new JAXBElement<String>(_InformacionLegalNombreRegistroRUT_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroMatriculaMercantil", scope = InformacionLegal.class)
    public JAXBElement<String> createInformacionLegalNumeroMatriculaMercantil(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroMatriculaMercantil_QNAME, String.class, InformacionLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGeneralSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "CamposGenerales", scope = DatosPacienteSalud.class)
    public JAXBElement<ArrayOfGeneralSalud> createDatosPacienteSaludCamposGenerales(ArrayOfGeneralSalud value) {
        return new JAXBElement<ArrayOfGeneralSalud>(_DatosPacienteSaludCamposGenerales_QNAME, ArrayOfGeneralSalud.class, DatosPacienteSalud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "comentario", scope = DatosEvento.class)
    public JAXBElement<String> createDatosEventoComentario(String value) {
        return new JAXBElement<String>(_DatosEventoComentario_QNAME, String.class, DatosEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoEvento", scope = DatosEvento.class)
    public JAXBElement<String> createDatosEventoCodigoEvento(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoEvento_QNAME, String.class, DatosEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "documento", scope = DatosEvento.class)
    public JAXBElement<String> createDatosEventoDocumento(String value) {
        return new JAXBElement<String>(_DatosEventoDocumento_QNAME, String.class, DatosEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosExtras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = DatosEvento.class)
    public JAXBElement<ArrayOfDatosExtras> createDatosEventoExtras(ArrayOfDatosExtras value) {
        return new JAXBElement<ArrayOfDatosExtras>(_MediosDePagoExtras_QNAME, ArrayOfDatosExtras.class, DatosEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno1", scope = DatosEvento.class)
    public JAXBElement<String> createDatosEventoCodigoInterno1(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoInterno1_QNAME, String.class, DatosEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno2", scope = DatosEvento.class)
    public JAXBElement<String> createDatosEventoCodigoInterno2(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoInterno2_QNAME, String.class, DatosEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CargarCertificado.class)
    public JAXBElement<String> createCargarCertificadoPassword(String value) {
        return new JAXBElement<String>(_CargarCertificadoPassword_QNAME, String.class, CargarCertificado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = CargarCertificado.class)
    public JAXBElement<String> createCargarCertificadoTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, CargarCertificado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = CargarCertificado.class)
    public JAXBElement<String> createCargarCertificadoTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, CargarCertificado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "certificado", scope = CargarCertificado.class)
    public JAXBElement<String> createCargarCertificadoCertificado(String value) {
        return new JAXBElement<String>(_CargarCertificadoCertificado_QNAME, String.class, CargarCertificado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescargarEventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DescargarEventoXMLResult", scope = DescargarEventoXMLResponse.class)
    public JAXBElement<DescargarEventoResponse> createDescargarEventoXMLResponseDescargarEventoXMLResult(DescargarEventoResponse value) {
        return new JAXBElement<DescargarEventoResponse>(_DescargarEventoXMLResponseDescargarEventoXMLResult_QNAME, DescargarEventoResponse.class, DescargarEventoXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombre", scope = Extensible.class)
    public JAXBElement<String> createExtensibleNombre(String value) {
        return new JAXBElement<String>(_ExtensibleNombre_QNAME, String.class, Extensible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "controlInterno1", scope = Extensible.class)
    public JAXBElement<String> createExtensibleControlInterno1(String value) {
        return new JAXBElement<String>(_ExtensibleControlInterno1_QNAME, String.class, Extensible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "valor", scope = Extensible.class)
    public JAXBElement<String> createExtensibleValor(String value) {
        return new JAXBElement<String>(_ExtensibleValor_QNAME, String.class, Extensible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "controlInterno2", scope = Extensible.class)
    public JAXBElement<String> createExtensibleControlInterno2(String value) {
        return new JAXBElement<String>(_ExtensibleControlInterno2_QNAME, String.class, Extensible.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoTOTALImp", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosCodigoTOTALImp(String value) {
        return new JAXBElement<String>(_FacturaImpuestosCodigoTOTALImp_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "unidadMedidaTributo", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosUnidadMedidaTributo(String value) {
        return new JAXBElement<String>(_FacturaImpuestosUnidadMedidaTributo_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = FacturaImpuestos.class)
    public JAXBElement<ArrayOfExtensible> createFacturaImpuestosExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "baseImponibleTOTALImp", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosBaseImponibleTOTALImp(String value) {
        return new JAXBElement<String>(_FacturaImpuestosBaseImponibleTOTALImp_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "controlInterno", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosControlInterno(String value) {
        return new JAXBElement<String>(_FacturaImpuestosControlInterno_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "porcentajeTOTALImp", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosPorcentajeTOTALImp(String value) {
        return new JAXBElement<String>(_FacturaImpuestosPorcentajeTOTALImp_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "unidadMedida", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosUnidadMedida(String value) {
        return new JAXBElement<String>(_FacturaImpuestosUnidadMedida_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "valorTOTALImp", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosValorTOTALImp(String value) {
        return new JAXBElement<String>(_FacturaImpuestosValorTOTALImp_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "valorTributoUnidad", scope = FacturaImpuestos.class)
    public JAXBElement<String> createFacturaImpuestosValorTributoUnidad(String value) {
        return new JAXBElement<String>(_FacturaImpuestosValorTributoUnidad_QNAME, String.class, FacturaImpuestos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = CargosDescuentos.class)
    public JAXBElement<ArrayOfExtensible> createCargosDescuentosExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "montoBase", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosMontoBase(String value) {
        return new JAXBElement<String>(_CargosDescuentosMontoBase_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "secuencia", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosSecuencia(String value) {
        return new JAXBElement<String>(_CargosDescuentosSecuencia_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "porcentaje", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosPorcentaje(String value) {
        return new JAXBElement<String>(_CargosDescuentosPorcentaje_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcion", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosDescripcion(String value) {
        return new JAXBElement<String>(_CargosDescuentosDescripcion_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "indicador", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosIndicador(String value) {
        return new JAXBElement<String>(_CargosDescuentosIndicador_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monto", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosMonto(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaMonto_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigo", scope = CargosDescuentos.class)
    public JAXBElement<String> createCargosDescuentosCodigo(String value) {
        return new JAXBElement<String>(_CargosDescuentosCodigo_QNAME, String.class, CargosDescuentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoTOTALImp", scope = ImpuestosTotales.class)
    public JAXBElement<String> createImpuestosTotalesCodigoTOTALImp(String value) {
        return new JAXBElement<String>(_FacturaImpuestosCodigoTOTALImp_QNAME, String.class, ImpuestosTotales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "montoTotal", scope = ImpuestosTotales.class)
    public JAXBElement<String> createImpuestosTotalesMontoTotal(String value) {
        return new JAXBElement<String>(_ImpuestosTotalesMontoTotal_QNAME, String.class, ImpuestosTotales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = ImpuestosTotales.class)
    public JAXBElement<ArrayOfExtensible> createImpuestosTotalesExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, ImpuestosTotales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "redondeoAplicado", scope = ImpuestosTotales.class)
    public JAXBElement<String> createImpuestosTotalesRedondeoAplicado(String value) {
        return new JAXBElement<String>(_ImpuestosTotalesRedondeoAplicado_QNAME, String.class, ImpuestosTotales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = LoadCertificateResponse.class)
    public JAXBElement<String> createLoadCertificateResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, LoadCertificateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = LoadCertificateResponse.class)
    public JAXBElement<String> createLoadCertificateResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, LoadCertificateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "baseMonedaOrigen", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioBaseMonedaOrigen(String value) {
        return new JAXBElement<String>(_TasaDeCambioBaseMonedaOrigen_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = TasaDeCambio.class)
    public JAXBElement<ArrayOfExtensible> createTasaDeCambioExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "indicadorDeTasa", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioIndicadorDeTasa(String value) {
        return new JAXBElement<String>(_TasaDeCambioIndicadorDeTasa_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monedaDestino", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioMonedaDestino(String value) {
        return new JAXBElement<String>(_TasaDeCambioMonedaDestino_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "baseMonedaDestino", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioBaseMonedaDestino(String value) {
        return new JAXBElement<String>(_TasaDeCambioBaseMonedaDestino_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "operadorCalculo", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioOperadorCalculo(String value) {
        return new JAXBElement<String>(_TasaDeCambioOperadorCalculo_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaDeTasaDeCambio", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioFechaDeTasaDeCambio(String value) {
        return new JAXBElement<String>(_TasaDeCambioFechaDeTasaDeCambio_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monedaOrigen", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioMonedaOrigen(String value) {
        return new JAXBElement<String>(_TasaDeCambioMonedaOrigen_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tasaDeCambio", scope = TasaDeCambio.class)
    public JAXBElement<String> createTasaDeCambioTasaDeCambio(String value) {
        return new JAXBElement<String>(_TasaDeCambioTasaDeCambio_QNAME, String.class, TasaDeCambio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = DescargarEventoXML.class)
    public JAXBElement<String> createDescargarEventoXMLTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, DescargarEventoXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = DescargarEventoXML.class)
    public JAXBElement<String> createDescargarEventoXMLTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, DescargarEventoXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documento", scope = DescargarEventoXML.class)
    public JAXBElement<String> createDescargarEventoXMLDocumento(String value) {
        return new JAXBElement<String>(_DescargaXMLDocumento_QNAME, String.class, DescargarEventoXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documentoEvento", scope = DescargarEventoXML.class)
    public JAXBElement<String> createDescargarEventoXMLDocumentoEvento(String value) {
        return new JAXBElement<String>(_DescargarEventoXMLDocumentoEvento_QNAME, String.class, DescargarEventoXML.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "idEsquema", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleIdEsquema(String value) {
        return new JAXBElement<String>(_FacturaDetalleIdEsquema_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "impuestosTotales", scope = FacturaDetalle.class)
    public JAXBElement<ArrayOfImpuestosTotales> createFacturaDetalleImpuestosTotales(ArrayOfImpuestosTotales value) {
        return new JAXBElement<ArrayOfImpuestosTotales>(_FacturaDetalleImpuestosTotales_QNAME, ArrayOfImpuestosTotales.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cantidadPorEmpaque", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCantidadPorEmpaque(String value) {
        return new JAXBElement<String>(_FacturaDetalleCantidadPorEmpaque_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarCodigoID", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarCodigoID(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarCodigoID_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "precioReferencia", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetallePrecioReferencia(String value) {
        return new JAXBElement<String>(_FacturaDetallePrecioReferencia_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = FacturaDetalle.class)
    public JAXBElement<ArrayOfExtensible> createFacturaDetalleExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cantidadReal", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCantidadReal(String value) {
        return new JAXBElement<String>(_FacturaDetalleCantidadReal_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cantidadRealUnidadMedida", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCantidadRealUnidadMedida(String value) {
        return new JAXBElement<String>(_FacturaDetalleCantidadRealUnidadMedida_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cargosDescuentos", scope = FacturaDetalle.class)
    public JAXBElement<ArrayOfCargosDescuentos> createFacturaDetalleCargosDescuentos(ArrayOfCargosDescuentos value) {
        return new JAXBElement<ArrayOfCargosDescuentos>(_TerminosDeEntregaCargosDescuentos_QNAME, ArrayOfCargosDescuentos.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "mandatorioTipoIdentificacion", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleMandatorioTipoIdentificacion(String value) {
        return new JAXBElement<String>(_FacturaDetalleMandatorioTipoIdentificacion_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "subCodigoFabricante", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleSubCodigoFabricante(String value) {
        return new JAXBElement<String>(_FacturaDetalleSubCodigoFabricante_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "mandatorioNumeroIdentificacionDV", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleMandatorioNumeroIdentificacionDV(String value) {
        return new JAXBElement<String>(_FacturaDetalleMandatorioNumeroIdentificacionDV_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cantidadUnidades", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCantidadUnidades(String value) {
        return new JAXBElement<String>(_FacturaDetalleCantidadUnidades_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaInformacionAdicional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "informacionAdicional", scope = FacturaDetalle.class)
    public JAXBElement<ArrayOfLineaInformacionAdicional> createFacturaDetalleInformacionAdicional(ArrayOfLineaInformacionAdicional value) {
        return new JAXBElement<ArrayOfLineaInformacionAdicional>(_FacturaDetalleInformacionAdicional_QNAME, ArrayOfLineaInformacionAdicional.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcion", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleDescripcion(String value) {
        return new JAXBElement<String>(_CargosDescuentosDescripcion_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nota", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleNota(String value) {
        return new JAXBElement<String>(_FacturaDetalleNota_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoProducto", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCodigoProducto(String value) {
        return new JAXBElement<String>(_FacturaDetalleCodigoProducto_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "precioTotal", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetallePrecioTotal(String value) {
        return new JAXBElement<String>(_FacturaDetallePrecioTotal_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoTipoPrecio", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCodigoTipoPrecio(String value) {
        return new JAXBElement<String>(_FacturaDetalleCodigoTipoPrecio_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "seriales", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleSeriales(String value) {
        return new JAXBElement<String>(_FacturaDetalleSeriales_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcionTecnica", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleDescripcionTecnica(String value) {
        return new JAXBElement<String>(_FacturaDetalleDescripcionTecnica_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "mandatorioNumeroIdentificacion", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleMandatorioNumeroIdentificacion(String value) {
        return new JAXBElement<String>(_FacturaDetalleMandatorioNumeroIdentificacion_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarCodigoProducto", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarCodigoProducto(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarCodigoProducto_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "marca", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleMarca(String value) {
        return new JAXBElement<String>(_FacturaDetalleMarca_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcion3", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleDescripcion3(String value) {
        return new JAXBElement<String>(_FacturaDetalleDescripcion3_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "modelo", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleModelo(String value) {
        return new JAXBElement<String>(_FacturaDetalleModelo_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "precioTotalSinImpuestos", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetallePrecioTotalSinImpuestos(String value) {
        return new JAXBElement<String>(_FacturaDetallePrecioTotalSinImpuestos_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcion2", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleDescripcion2(String value) {
        return new JAXBElement<String>(_FacturaDetalleDescripcion2_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarOrganizacion", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarOrganizacion(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarOrganizacion_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "secuencia", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleSecuencia(String value) {
        return new JAXBElement<String>(_CargosDescuentosSecuencia_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoFabricante", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCodigoFabricante(String value) {
        return new JAXBElement<String>(_FacturaDetalleCodigoFabricante_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoIdentificadorPais", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleCodigoIdentificadorPais(String value) {
        return new JAXBElement<String>(_FacturaDetalleCodigoIdentificadorPais_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "unidadMedida", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleUnidadMedida(String value) {
        return new JAXBElement<String>(_FacturaImpuestosUnidadMedida_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreFabricante", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleNombreFabricante(String value) {
        return new JAXBElement<String>(_FacturaDetalleNombreFabricante_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoAIU", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleTipoAIU(String value) {
        return new JAXBElement<String>(_FacturaDetalleTipoAIU_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "impuestosDetalles", scope = FacturaDetalle.class)
    public JAXBElement<ArrayOfFacturaImpuestos> createFacturaDetalleImpuestosDetalles(ArrayOfFacturaImpuestos value) {
        return new JAXBElement<ArrayOfFacturaImpuestos>(_FacturaDetalleImpuestosDetalles_QNAME, ArrayOfFacturaImpuestos.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarCodigoIdentificador", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarCodigoIdentificador(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarCodigoIdentificador_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "muestraGratis", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleMuestraGratis(String value) {
        return new JAXBElement<String>(_FacturaDetalleMuestraGratis_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "documentosReferenciados", scope = FacturaDetalle.class)
    public JAXBElement<ArrayOfDocumentoReferenciado> createFacturaDetalleDocumentosReferenciados(ArrayOfDocumentoReferenciado value) {
        return new JAXBElement<ArrayOfDocumentoReferenciado>(_FacturaDetalleDocumentosReferenciados_QNAME, ArrayOfDocumentoReferenciado.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "subCodigoProducto", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleSubCodigoProducto(String value) {
        return new JAXBElement<String>(_FacturaDetalleSubCodigoProducto_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarCodigo", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarCodigo(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarCodigo_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarCodigoNombre", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarCodigoNombre(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarCodigoNombre_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "precioVentaUnitario", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetallePrecioVentaUnitario(String value) {
        return new JAXBElement<String>(_FacturaDetallePrecioVentaUnitario_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "estandarSubCodigoProducto", scope = FacturaDetalle.class)
    public JAXBElement<String> createFacturaDetalleEstandarSubCodigoProducto(String value) {
        return new JAXBElement<String>(_FacturaDetalleEstandarSubCodigoProducto_QNAME, String.class, FacturaDetalle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fechaRespuesta", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseFechaRespuesta(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseFechaRespuesta_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "hash", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseHash(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseHash_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cufe", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseCufe_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "documento", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseDocumento(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseDocumento_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoCufe", scope = DescargarEventoResponse.class)
    public JAXBElement<String> createDescargarEventoResponseTipoCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseTipoCufe_QNAME, String.class, DescargarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nota", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoNota(String value) {
        return new JAXBElement<String>(_FacturaDetalleNota_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefono", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoTelefono(String value) {
        return new JAXBElement<String>(_AutorizadoTelefono_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "email", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoEmail(String value) {
        return new JAXBElement<String>(_AutorizadoEmail_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefax", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoTelefax(String value) {
        return new JAXBElement<String>(_AutorizadoTelefax_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Autorizado.class)
    public JAXBElement<ArrayOfExtensible> createAutorizadoExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreComercial", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoNombreComercial(String value) {
        return new JAXBElement<String>(_AutorizadoNombreComercial_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccion", scope = Autorizado.class)
    public JAXBElement<Direccion> createAutorizadoDireccion(Direccion value) {
        return new JAXBElement<Direccion>(_AutorizadoDireccion_QNAME, Direccion.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroDocumento", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoNumeroDocumento(String value) {
        return new JAXBElement<String>(_AutorizadoNumeroDocumento_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroDocumentoDV", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoNumeroDocumentoDV(String value) {
        return new JAXBElement<String>(_AutorizadoNumeroDocumentoDV_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoIdentificacion", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoTipoIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalTipoIdentificacion_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreContacto", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoNombreContacto(String value) {
        return new JAXBElement<String>(_AutorizadoNombreContacto_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "razonSocial", scope = Autorizado.class)
    public JAXBElement<String> createAutorizadoRazonSocial(String value) {
        return new JAXBElement<String>(_AutorizadoRazonSocial_QNAME, String.class, Autorizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaFin", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalFechaFin(String value) {
        return new JAXBElement<String>(_LineaInformacionAdicionalFechaFin_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombre", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalNombre(String value) {
        return new JAXBElement<String>(_ExtensibleNombre_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "unidadMedidaTransporte", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalUnidadMedidaTransporte(String value) {
        return new JAXBElement<String>(_LineaInformacionAdicionalUnidadMedidaTransporte_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "secuencia", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalSecuencia(String value) {
        return new JAXBElement<String>(_CargosDescuentosSecuencia_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "valor", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalValor(String value) {
        return new JAXBElement<String>(_ExtensibleValor_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cantidad", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalCantidad(String value) {
        return new JAXBElement<String>(_LineaInformacionAdicionalCantidad_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaInicio", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalFechaInicio(String value) {
        return new JAXBElement<String>(_LineaInformacionAdicionalFechaInicio_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno1", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalCodigoInterno1(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoInterno1_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno2", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalCodigoInterno2(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoInterno2_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcion", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalDescripcion(String value) {
        return new JAXBElement<String>(_CargosDescuentosDescripcion_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigo", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalCodigo(String value) {
        return new JAXBElement<String>(_CargosDescuentosCodigo_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipo", scope = LineaInformacionAdicional.class)
    public JAXBElement<String> createLineaInformacionAdicionalTipo(String value) {
        return new JAXBElement<String>(_LineaInformacionAdicionalTipo_QNAME, String.class, LineaInformacionAdicional.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = GenerarContenedor.class)
    public JAXBElement<String> createGenerarContenedorTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, GenerarContenedor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = GenerarContenedor.class)
    public JAXBElement<String> createGenerarContenedorTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, GenerarContenedor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documento", scope = GenerarContenedor.class)
    public JAXBElement<String> createGenerarContenedorDocumento(String value) {
        return new JAXBElement<String>(_DescargaXMLDocumento_QNAME, String.class, GenerarContenedor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDestinatario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "destinatario", scope = Cliente.class)
    public JAXBElement<ArrayOfDestinatario> createClienteDestinatario(ArrayOfDestinatario value) {
        return new JAXBElement<ArrayOfDestinatario>(_ClienteDestinatario_QNAME, ArrayOfDestinatario.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccionCliente", scope = Cliente.class)
    public JAXBElement<Direccion> createClienteDireccionCliente(Direccion value) {
        return new JAXBElement<Direccion>(_ClienteDireccionCliente_QNAME, Direccion.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Cliente.class)
    public JAXBElement<ArrayOfExtensible> createClienteExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccionFiscal", scope = Cliente.class)
    public JAXBElement<Direccion> createClienteDireccionFiscal(Direccion value) {
        return new JAXBElement<Direccion>(_ClienteDireccionFiscal_QNAME, Direccion.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoIdentificacion", scope = Cliente.class)
    public JAXBElement<String> createClienteTipoIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalTipoIdentificacion_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacionLegal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "informacionLegalCliente", scope = Cliente.class)
    public JAXBElement<InformacionLegal> createClienteInformacionLegalCliente(InformacionLegal value) {
        return new JAXBElement<InformacionLegal>(_ClienteInformacionLegalCliente_QNAME, InformacionLegal.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreRazonSocial", scope = Cliente.class)
    public JAXBElement<String> createClienteNombreRazonSocial(String value) {
        return new JAXBElement<String>(_ClienteNombreRazonSocial_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "notificar", scope = Cliente.class)
    public JAXBElement<String> createClienteNotificar(String value) {
        return new JAXBElement<String>(_ClienteNotificar_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoPersona", scope = Cliente.class)
    public JAXBElement<String> createClienteTipoPersona(String value) {
        return new JAXBElement<String>(_ClienteTipoPersona_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "segundoNombre", scope = Cliente.class)
    public JAXBElement<String> createClienteSegundoNombre(String value) {
        return new JAXBElement<String>(_ClienteSegundoNombre_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nota", scope = Cliente.class)
    public JAXBElement<String> createClienteNota(String value) {
        return new JAXBElement<String>(_FacturaDetalleNota_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "detallesTributarios", scope = Cliente.class)
    public JAXBElement<ArrayOfTributos> createClienteDetallesTributarios(ArrayOfTributos value) {
        return new JAXBElement<ArrayOfTributos>(_ClienteDetallesTributarios_QNAME, ArrayOfTributos.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefono", scope = Cliente.class)
    public JAXBElement<String> createClienteTelefono(String value) {
        return new JAXBElement<String>(_AutorizadoTelefono_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "email", scope = Cliente.class)
    public JAXBElement<String> createClienteEmail(String value) {
        return new JAXBElement<String>(_AutorizadoEmail_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefax", scope = Cliente.class)
    public JAXBElement<String> createClienteTelefax(String value) {
        return new JAXBElement<String>(_AutorizadoTelefax_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreComercial", scope = Cliente.class)
    public JAXBElement<String> createClienteNombreComercial(String value) {
        return new JAXBElement<String>(_AutorizadoNombreComercial_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroIdentificacionDV", scope = Cliente.class)
    public JAXBElement<String> createClienteNumeroIdentificacionDV(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroIdentificacionDV_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroDocumento", scope = Cliente.class)
    public JAXBElement<String> createClienteNumeroDocumento(String value) {
        return new JAXBElement<String>(_AutorizadoNumeroDocumento_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "responsabilidadesRut", scope = Cliente.class)
    public JAXBElement<ArrayOfObligaciones> createClienteResponsabilidadesRut(ArrayOfObligaciones value) {
        return new JAXBElement<ArrayOfObligaciones>(_ClienteResponsabilidadesRut_QNAME, ArrayOfObligaciones.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "apellido", scope = Cliente.class)
    public JAXBElement<String> createClienteApellido(String value) {
        return new JAXBElement<String>(_ClienteApellido_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "actividadEconomicaCIIU", scope = Cliente.class)
    public JAXBElement<String> createClienteActividadEconomicaCIIU(String value) {
        return new JAXBElement<String>(_ClienteActividadEconomicaCIIU_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreContacto", scope = Cliente.class)
    public JAXBElement<String> createClienteNombreContacto(String value) {
        return new JAXBElement<String>(_AutorizadoNombreContacto_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = SendEmailResponse.class)
    public JAXBElement<String> createSendEmailResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, SendEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = SendEmailResponse.class)
    public JAXBElement<String> createSendEmailResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, SendEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "datosEvento", scope = GenerarEvento.class)
    public JAXBElement<DatosEvento> createGenerarEventoDatosEvento(DatosEvento value) {
        return new JAXBElement<DatosEvento>(_GenerarEventoDatosEvento_QNAME, DatosEvento.class, GenerarEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = GenerarEvento.class)
    public JAXBElement<String> createGenerarEventoTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, GenerarEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = GenerarEvento.class)
    public JAXBElement<String> createGenerarEventoTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, GenerarEvento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GenerarEventoResult", scope = GenerarEventoResponse.class)
    public JAXBElement<EventoResponse> createGenerarEventoResponseGenerarEventoResult(EventoResponse value) {
        return new JAXBElement<EventoResponse>(_GenerarEventoResponseGenerarEventoResult_QNAME, EventoResponse.class, GenerarEventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoReferenciado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "documentoReferencia", scope = OrdenDeCompra.class)
    public JAXBElement<DocumentoReferenciado> createOrdenDeCompraDocumentoReferencia(DocumentoReferenciado value) {
        return new JAXBElement<DocumentoReferenciado>(_OrdenDeCompraDocumentoReferencia_QNAME, DocumentoReferenciado.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "uuid", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraUuid(String value) {
        return new JAXBElement<String>(_OrdenDeCompraUuid_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = OrdenDeCompra.class)
    public JAXBElement<ArrayOfExtensible> createOrdenDeCompraExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroPedido", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraNumeroPedido(String value) {
        return new JAXBElement<String>(_OrdenDeCompraNumeroPedido_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoCUFE", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraTipoCUFE(String value) {
        return new JAXBElement<String>(_OrdenDeCompraTipoCUFE_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoCliente", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraCodigoCliente(String value) {
        return new JAXBElement<String>(_OrdenDeCompraCodigoCliente_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoOrden", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraTipoOrden(String value) {
        return new JAXBElement<String>(_OrdenDeCompraTipoOrden_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fecha", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraFecha(String value) {
        return new JAXBElement<String>(_OrdenDeCompraFecha_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroOrden", scope = OrdenDeCompra.class)
    public JAXBElement<String> createOrdenDeCompraNumeroOrden(String value) {
        return new JAXBElement<String>(_OrdenDeCompraNumeroOrden_QNAME, String.class, OrdenDeCompra.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombre", scope = Extras.class)
    public JAXBElement<String> createExtrasNombre(String value) {
        return new JAXBElement<String>(_ExtensibleNombre_QNAME, String.class, Extras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "controlInterno1", scope = Extras.class)
    public JAXBElement<String> createExtrasControlInterno1(String value) {
        return new JAXBElement<String>(_ExtensibleControlInterno1_QNAME, String.class, Extras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "valor", scope = Extras.class)
    public JAXBElement<String> createExtrasValor(String value) {
        return new JAXBElement<String>(_ExtensibleValor_QNAME, String.class, Extras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "controlInterno2", scope = Extras.class)
    public JAXBElement<String> createExtrasControlInterno2(String value) {
        return new JAXBElement<String>(_ExtensibleControlInterno2_QNAME, String.class, Extras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "xml", scope = Extras.class)
    public JAXBElement<String> createExtrasXml(String value) {
        return new JAXBElement<String>(_ExtrasXml_QNAME, String.class, Extras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "pdf", scope = Extras.class)
    public JAXBElement<String> createExtrasPdf(String value) {
        return new JAXBElement<String>(_ExtrasPdf_QNAME, String.class, Extras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfImpuestosTotales }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "impuestosTotales", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfImpuestosTotales> createFacturaGeneralImpuestosTotales(ArrayOfImpuestosTotales value) {
        return new JAXBElement<ArrayOfImpuestosTotales>(_FacturaDetalleImpuestosTotales_QNAME, ArrayOfImpuestosTotales.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfExtras> createFacturaGeneralExtras(ArrayOfExtras value) {
        return new JAXBElement<ArrayOfExtras>(_MediosDePagoExtras_QNAME, ArrayOfExtras.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "propina", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralPropina(String value) {
        return new JAXBElement<String>(_FacturaGeneralPropina_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "consecutivoDocumento", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralConsecutivoDocumento(String value) {
        return new JAXBElement<String>(_FacturaGeneralConsecutivoDocumento_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCargosDescuentos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cargosDescuentos", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfCargosDescuentos> createFacturaGeneralCargosDescuentos(ArrayOfCargosDescuentos value) {
        return new JAXBElement<ArrayOfCargosDescuentos>(_TerminosDeEntregaCargosDescuentos_QNAME, ArrayOfCargosDescuentos.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "informacionAdicional", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfstring> createFacturaGeneralInformacionAdicional(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_FacturaDetalleInformacionAdicional_QNAME, ArrayOfstring.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TasaDeCambio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tasaDeCambio", scope = FacturaGeneral.class)
    public JAXBElement<TasaDeCambio> createFacturaGeneralTasaDeCambio(TasaDeCambio value) {
        return new JAXBElement<TasaDeCambio>(_TasaDeCambioTasaDeCambio_QNAME, TasaDeCambio.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalProductos", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalProductos(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalProductos_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCondicionDePago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "condicionPago", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfCondicionDePago> createFacturaGeneralCondicionPago(ArrayOfCondicionDePago value) {
        return new JAXBElement<ArrayOfCondicionDePago>(_FacturaGeneralCondicionPago_QNAME, ArrayOfCondicionDePago.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnticipos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "anticipos", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfAnticipos> createFacturaGeneralAnticipos(ArrayOfAnticipos value) {
        return new JAXBElement<ArrayOfAnticipos>(_FacturaGeneralAnticipos_QNAME, ArrayOfAnticipos.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalAnticipos", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalAnticipos(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalAnticipos_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "moneda", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralMoneda(String value) {
        return new JAXBElement<String>(_FacturaGeneralMoneda_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalCargosAplicados", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalCargosAplicados(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalCargosAplicados_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalMonto", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalMonto(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalMonto_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalBrutoConImpuesto", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalBrutoConImpuesto(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalBrutoConImpuesto_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "entregaMercancia", scope = FacturaGeneral.class)
    public JAXBElement<Entrega> createFacturaGeneralEntregaMercancia(Entrega value) {
        return new JAXBElement<Entrega>(_FacturaGeneralEntregaMercancia_QNAME, Entrega.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaEmision", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralFechaEmision(String value) {
        return new JAXBElement<String>(_FacturaGeneralFechaEmision_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaPagoImpuestos", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralFechaPagoImpuestos(String value) {
        return new JAXBElement<String>(_FacturaGeneralFechaPagoImpuestos_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TasaDeCambioAlternativa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tasaDeCambioAlternativa", scope = FacturaGeneral.class)
    public JAXBElement<TasaDeCambioAlternativa> createFacturaGeneralTasaDeCambioAlternativa(TasaDeCambioAlternativa value) {
        return new JAXBElement<TasaDeCambioAlternativa>(_FacturaGeneralTasaDeCambioAlternativa_QNAME, TasaDeCambioAlternativa.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoSector", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTipoSector(String value) {
        return new JAXBElement<String>(_FacturaGeneralTipoSector_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalBaseImponible", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalBaseImponible(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalBaseImponible_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenDeCompra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ordenDeCompra", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfOrdenDeCompra> createFacturaGeneralOrdenDeCompra(ArrayOfOrdenDeCompra value) {
        return new JAXBElement<ArrayOfOrdenDeCompra>(_FacturaGeneralOrdenDeCompra_QNAME, ArrayOfOrdenDeCompra.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaImpuestos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "impuestosGenerales", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfFacturaImpuestos> createFacturaGeneralImpuestosGenerales(ArrayOfFacturaImpuestos value) {
        return new JAXBElement<ArrayOfFacturaImpuestos>(_FacturaGeneralImpuestosGenerales_QNAME, ArrayOfFacturaImpuestos.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Autorizado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "autorizado", scope = FacturaGeneral.class)
    public JAXBElement<Autorizado> createFacturaGeneralAutorizado(Autorizado value) {
        return new JAXBElement<Autorizado>(_FacturaGeneralAutorizado_QNAME, Autorizado.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaVencimiento", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralFechaVencimiento(String value) {
        return new JAXBElement<String>(_FacturaGeneralFechaVencimiento_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentoReferenciado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "documentosReferenciados", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfDocumentoReferenciado> createFacturaGeneralDocumentosReferenciados(ArrayOfDocumentoReferenciado value) {
        return new JAXBElement<ArrayOfDocumentoReferenciado>(_FacturaDetalleDocumentosReferenciados_QNAME, ArrayOfDocumentoReferenciado.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cantidadDecimales", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralCantidadDecimales(String value) {
        return new JAXBElement<String>(_FacturaGeneralCantidadDecimales_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaInicioPeriodoFacturacion", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralFechaInicioPeriodoFacturacion(String value) {
        return new JAXBElement<String>(_FacturaGeneralFechaInicioPeriodoFacturacion_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "rangoNumeracion", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralRangoNumeracion(String value) {
        return new JAXBElement<String>(_FacturaGeneralRangoNumeracion_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "redondeoAplicado", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralRedondeoAplicado(String value) {
        return new JAXBElement<String>(_ImpuestosTotalesRedondeoAplicado_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoOperacion", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTipoOperacion(String value) {
        return new JAXBElement<String>(_FacturaGeneralTipoOperacion_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFacturaDetalle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "detalleDeFactura", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfFacturaDetalle> createFacturaGeneralDetalleDeFactura(ArrayOfFacturaDetalle value) {
        return new JAXBElement<ArrayOfFacturaDetalle>(_FacturaGeneralDetalleDeFactura_QNAME, ArrayOfFacturaDetalle.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalSinImpuestos", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalSinImpuestos(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalSinImpuestos_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectorSalud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "sectorSalud", scope = FacturaGeneral.class)
    public JAXBElement<SectorSalud> createFacturaGeneralSectorSalud(SectorSalud value) {
        return new JAXBElement<SectorSalud>(_FacturaGeneralSectorSalud_QNAME, SectorSalud.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMediosDePago }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "mediosDePago", scope = FacturaGeneral.class)
    public JAXBElement<ArrayOfMediosDePago> createFacturaGeneralMediosDePago(ArrayOfMediosDePago value) {
        return new JAXBElement<ArrayOfMediosDePago>(_FacturaGeneralMediosDePago_QNAME, ArrayOfMediosDePago.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cliente", scope = FacturaGeneral.class)
    public JAXBElement<Cliente> createFacturaGeneralCliente(Cliente value) {
        return new JAXBElement<Cliente>(_FacturaGeneralCliente_QNAME, Cliente.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoDocumento", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTipoDocumento(String value) {
        return new JAXBElement<String>(_FacturaGeneralTipoDocumento_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaFinPeriodoFacturacion", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralFechaFinPeriodoFacturacion(String value) {
        return new JAXBElement<String>(_FacturaGeneralFechaFinPeriodoFacturacion_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TerminosDeEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "terminosEntrega", scope = FacturaGeneral.class)
    public JAXBElement<TerminosDeEntrega> createFacturaGeneralTerminosEntrega(TerminosDeEntrega value) {
        return new JAXBElement<TerminosDeEntrega>(_FacturaGeneralTerminosEntrega_QNAME, TerminosDeEntrega.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "totalDescuentos", scope = FacturaGeneral.class)
    public JAXBElement<String> createFacturaGeneralTotalDescuentos(String value) {
        return new JAXBElement<String>(_FacturaGeneralTotalDescuentos_QNAME, String.class, FacturaGeneral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarResult", scope = EnviarResponse.class)
    public JAXBElement<DocumentResponse> createEnviarResponseEnviarResult(DocumentResponse value) {
        return new JAXBElement<DocumentResponse>(_EnviarResponseEnviarResult_QNAME, DocumentResponse.class, EnviarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = EstadoDocumento.class)
    public JAXBElement<String> createEstadoDocumentoTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, EstadoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = EstadoDocumento.class)
    public JAXBElement<String> createEstadoDocumentoTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, EstadoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documento", scope = EstadoDocumento.class)
    public JAXBElement<String> createEstadoDocumentoDocumento(String value) {
        return new JAXBElement<String>(_DescargaXMLDocumento_QNAME, String.class, EstadoDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "reglasValidacionDIAN", scope = DocumentStatusResponse.class)
    public JAXBElement<ArrayOfstring> createDocumentStatusResponseReglasValidacionDIAN(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DocumentStatusResponseReglasValidacionDIAN_QNAME, ArrayOfstring.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cufe", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseCufe_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fechaAceptacionDIAN", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseFechaAceptacionDIAN(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseFechaAceptacionDIAN_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fechaDocumento", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseFechaDocumento(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseFechaDocumento_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoCufe", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseTipoCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseTipoCufe_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "descripcionEstatusDocumento", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseDescripcionEstatusDocumento(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseDescripcionEstatusDocumento_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "acuseComentario", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseAcuseComentario(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseAcuseComentario_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "consecutivo", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseConsecutivo(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseConsecutivo_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoDocumento", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseTipoDocumento_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "acuseRespuesta", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseAcuseRespuesta(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseAcuseRespuesta_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "descripcionDocumento", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseDescripcionDocumento(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseDescripcionDocumento_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "acuseEstatus", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseAcuseEstatus(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseAcuseEstatus_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "acuseResponsable", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseAcuseResponsable(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseAcuseResponsable_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cadenaCufe", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseCadenaCufe(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseCadenaCufe_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cadenaCodigoQR", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseCadenaCodigoQR(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseCadenaCodigoQR_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "eventos", scope = DocumentStatusResponse.class)
    public JAXBElement<ArrayOfEvento> createDocumentStatusResponseEventos(ArrayOfEvento value) {
        return new JAXBElement<ArrayOfEvento>(_DocumentStatusResponseEventos_QNAME, ArrayOfEvento.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensajeDocumento", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseMensajeDocumento(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseMensajeDocumento_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "ambiente", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseAmbiente(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseAmbiente_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "trackID", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseTrackID(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseTrackID_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHistorialDeEntrega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "historialDeEntregas", scope = DocumentStatusResponse.class)
    public JAXBElement<ArrayOfHistorialDeEntrega> createDocumentStatusResponseHistorialDeEntregas(ArrayOfHistorialDeEntrega value) {
        return new JAXBElement<ArrayOfHistorialDeEntrega>(_DocumentStatusResponseHistorialDeEntregas_QNAME, ArrayOfHistorialDeEntrega.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "entregaMetodoDIAN", scope = DocumentStatusResponse.class)
    public JAXBElement<String> createDocumentStatusResponseEntregaMetodoDIAN(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseEntregaMetodoDIAN_QNAME, String.class, DocumentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = FoliosRemainingResponse.class)
    public JAXBElement<String> createFoliosRemainingResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, FoliosRemainingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = FoliosRemainingResponse.class)
    public JAXBElement<String> createFoliosRemainingResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, FoliosRemainingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "mensajePersonalizado", scope = Destinatario.class)
    public JAXBElement<String> createDestinatarioMensajePersonalizado(String value) {
        return new JAXBElement<String>(_DestinatarioMensajePersonalizado_QNAME, String.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefono", scope = Destinatario.class)
    public JAXBElement<String> createDestinatarioTelefono(String value) {
        return new JAXBElement<String>(_AutorizadoTelefono_QNAME, String.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "canalDeEntrega", scope = Destinatario.class)
    public JAXBElement<String> createDestinatarioCanalDeEntrega(String value) {
        return new JAXBElement<String>(_DestinatarioCanalDeEntrega_QNAME, String.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "email", scope = Destinatario.class)
    public JAXBElement<ArrayOfstring> createDestinatarioEmail(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AutorizadoEmail_QNAME, ArrayOfstring.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Destinatario.class)
    public JAXBElement<ArrayOfExtensible> createDestinatarioExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaProgramada", scope = Destinatario.class)
    public JAXBElement<String> createDestinatarioFechaProgramada(String value) {
        return new JAXBElement<String>(_DestinatarioFechaProgramada_QNAME, String.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nitProveedorReceptor", scope = Destinatario.class)
    public JAXBElement<String> createDestinatarioNitProveedorReceptor(String value) {
        return new JAXBElement<String>(_DestinatarioNitProveedorReceptor_QNAME, String.class, Destinatario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "reglasValidacionDIAN", scope = DocumentResponse.class)
    public JAXBElement<ArrayOfstring> createDocumentResponseReglasValidacionDIAN(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DocumentStatusResponseReglasValidacionDIAN_QNAME, ArrayOfstring.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "hash", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseHash(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseHash_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cufe", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseCufe_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fechaAceptacionDIAN", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseFechaAceptacionDIAN(String value) {
        return new JAXBElement<String>(_DocumentStatusResponseFechaAceptacionDIAN_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoCufe", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseTipoCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseTipoCufe_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "xml", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseXml(String value) {
        return new JAXBElement<String>(_DocumentResponseXml_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensajesValidacion", scope = DocumentResponse.class)
    public JAXBElement<ArrayOfstring> createDocumentResponseMensajesValidacion(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DocumentResponseMensajesValidacion_QNAME, ArrayOfstring.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "nombre", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseNombre(String value) {
        return new JAXBElement<String>(_DocumentResponseNombre_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fechaRespuesta", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseFechaRespuesta(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseFechaRespuesta_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "reglasNotificacionDIAN", scope = DocumentResponse.class)
    public JAXBElement<ArrayOfstring> createDocumentResponseReglasNotificacionDIAN(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_DocumentResponseReglasNotificacionDIAN_QNAME, ArrayOfstring.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "consecutivoDocumento", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseConsecutivoDocumento(String value) {
        return new JAXBElement<String>(_DocumentResponseConsecutivoDocumento_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "qr", scope = DocumentResponse.class)
    public JAXBElement<String> createDocumentResponseQr(String value) {
        return new JAXBElement<String>(_DocumentResponseQr_QNAME, String.class, DocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "fechaEmision", scope = Evento.class)
    public JAXBElement<String> createEventoFechaEmision(String value) {
        return new JAXBElement<String>(_EventoFechaEmision_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "comentario", scope = Evento.class)
    public JAXBElement<String> createEventoComentario(String value) {
        return new JAXBElement<String>(_EventoComentario_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "codigo", scope = Evento.class)
    public JAXBElement<String> createEventoCodigo(String value) {
        return new JAXBElement<String>(_EventoCodigo_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "resultado", scope = Evento.class)
    public JAXBElement<String> createEventoResultado(String value) {
        return new JAXBElement<String>(_EventoResultado_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "ambienteDIAN", scope = Evento.class)
    public JAXBElement<String> createEventoAmbienteDIAN(String value) {
        return new JAXBElement<String>(_EventoAmbienteDIAN_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "mensaje", scope = Evento.class)
    public JAXBElement<String> createEventoMensaje(String value) {
        return new JAXBElement<String>(_EventoMensaje_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "emisorRazonSocial", scope = Evento.class)
    public JAXBElement<String> createEventoEmisorRazonSocial(String value) {
        return new JAXBElement<String>(_EventoEmisorRazonSocial_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "receptorRazonSocial", scope = Evento.class)
    public JAXBElement<String> createEventoReceptorRazonSocial(String value) {
        return new JAXBElement<String>(_EventoReceptorRazonSocial_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "hash", scope = Evento.class)
    public JAXBElement<String> createEventoHash(String value) {
        return new JAXBElement<String>(_EventoHash_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "fechaRecepcion", scope = Evento.class)
    public JAXBElement<String> createEventoFechaRecepcion(String value) {
        return new JAXBElement<String>(_EventoFechaRecepcion_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "emisorNumeroDocumento", scope = Evento.class)
    public JAXBElement<String> createEventoEmisorNumeroDocumento(String value) {
        return new JAXBElement<String>(_EventoEmisorNumeroDocumento_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "tipoEvento", scope = Evento.class)
    public JAXBElement<String> createEventoTipoEvento(String value) {
        return new JAXBElement<String>(_EventoTipoEvento_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "emisorNumeroDocumentoDV", scope = Evento.class)
    public JAXBElement<String> createEventoEmisorNumeroDocumentoDV(String value) {
        return new JAXBElement<String>(_EventoEmisorNumeroDocumentoDV_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtrasEvento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "extras", scope = Evento.class)
    public JAXBElement<ArrayOfExtrasEvento> createEventoExtras(ArrayOfExtrasEvento value) {
        return new JAXBElement<ArrayOfExtrasEvento>(_EventoExtras_QNAME, ArrayOfExtrasEvento.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "versionUBL", scope = Evento.class)
    public JAXBElement<String> createEventoVersionUBL(String value) {
        return new JAXBElement<String>(_EventoVersionUBL_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "nombreArchivoXML", scope = Evento.class)
    public JAXBElement<String> createEventoNombreArchivoXML(String value) {
        return new JAXBElement<String>(_EventoNombreArchivoXML_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "receptorNumeroDocumento", scope = Evento.class)
    public JAXBElement<String> createEventoReceptorNumeroDocumento(String value) {
        return new JAXBElement<String>(_EventoReceptorNumeroDocumento_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "numeroDelEvento", scope = Evento.class)
    public JAXBElement<String> createEventoNumeroDelEvento(String value) {
        return new JAXBElement<String>(_EventoNumeroDelEvento_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "emisorTipoIdentificacion", scope = Evento.class)
    public JAXBElement<String> createEventoEmisorTipoIdentificacion(String value) {
        return new JAXBElement<String>(_EventoEmisorTipoIdentificacion_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "cufe", scope = Evento.class)
    public JAXBElement<String> createEventoCufe(String value) {
        return new JAXBElement<String>(_EventoCufe_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "idPerfilDIAN", scope = Evento.class)
    public JAXBElement<String> createEventoIdPerfilDIAN(String value) {
        return new JAXBElement<String>(_EventoIdPerfilDIAN_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "nota", scope = Evento.class)
    public JAXBElement<String> createEventoNota(String value) {
        return new JAXBElement<String>(_EventoNota_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "receptorNumeroDocumentoDV", scope = Evento.class)
    public JAXBElement<String> createEventoReceptorNumeroDocumentoDV(String value) {
        return new JAXBElement<String>(_EventoReceptorNumeroDocumentoDV_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "xml", scope = Evento.class)
    public JAXBElement<String> createEventoXml(String value) {
        return new JAXBElement<String>(_EventoXml_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "descripcionEvento", scope = Evento.class)
    public JAXBElement<String> createEventoDescripcionEvento(String value) {
        return new JAXBElement<String>(_EventoDescripcionEvento_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "receptorTipoIdentificacion", scope = Evento.class)
    public JAXBElement<String> createEventoReceptorTipoIdentificacion(String value) {
        return new JAXBElement<String>(_EventoReceptorTipoIdentificacion_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.Models.Response", name = "tipoCufe", scope = Evento.class)
    public JAXBElement<String> createEventoTipoCufe(String value) {
        return new JAXBElement<String>(_EventoTipoCufe_QNAME, String.class, Evento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContenedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GenerarContenedorResult", scope = GenerarContenedorResponse.class)
    public JAXBElement<ContenedorResponse> createGenerarContenedorResponseGenerarContenedorResult(ContenedorResponse value) {
        return new JAXBElement<ContenedorResponse>(_GenerarContenedorResponseGenerarContenedorResult_QNAME, ContenedorResponse.class, GenerarContenedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccionDespacho", scope = Entrega.class)
    public JAXBElement<Direccion> createEntregaDireccionDespacho(Direccion value) {
        return new JAXBElement<Direccion>(_EntregaDireccionDespacho_QNAME, Direccion.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosDelTransportista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "datosTransportistas", scope = Entrega.class)
    public JAXBElement<DatosDelTransportista> createEntregaDatosTransportistas(DatosDelTransportista value) {
        return new JAXBElement<DatosDelTransportista>(_EntregaDatosTransportistas_QNAME, DatosDelTransportista.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Entrega.class)
    public JAXBElement<ArrayOfExtensible> createEntregaExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaEstimada", scope = Entrega.class)
    public JAXBElement<String> createEntregaFechaEstimada(String value) {
        return new JAXBElement<String>(_EntregaFechaEstimada_QNAME, String.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaSolicitada", scope = Entrega.class)
    public JAXBElement<String> createEntregaFechaSolicitada(String value) {
        return new JAXBElement<String>(_EntregaFechaSolicitada_QNAME, String.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "matriculaTransporte", scope = Entrega.class)
    public JAXBElement<String> createEntregaMatriculaTransporte(String value) {
        return new JAXBElement<String>(_EntregaMatriculaTransporte_QNAME, String.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "identificacionTransporte", scope = Entrega.class)
    public JAXBElement<String> createEntregaIdentificacionTransporte(String value) {
        return new JAXBElement<String>(_EntregaIdentificacionTransporte_QNAME, String.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccionEntrega", scope = Entrega.class)
    public JAXBElement<Direccion> createEntregaDireccionEntrega(Direccion value) {
        return new JAXBElement<Direccion>(_TerminosDeEntregaDireccionEntrega_QNAME, Direccion.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaEfectivaSalida", scope = Entrega.class)
    public JAXBElement<String> createEntregaFechaEfectivaSalida(String value) {
        return new JAXBElement<String>(_EntregaFechaEfectivaSalida_QNAME, String.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaReal", scope = Entrega.class)
    public JAXBElement<String> createEntregaFechaReal(String value) {
        return new JAXBElement<String>(_EntregaFechaReal_QNAME, String.class, Entrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = DocumentoReferenciado.class)
    public JAXBElement<ArrayOfExtensible> createDocumentoReferenciadoExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroIdentificacion", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoNumeroIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroIdentificacion_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoCodigoInterno(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoCodigoInterno_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "cufeDocReferenciado", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoCufeDocReferenciado(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoCufeDocReferenciado_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "descripcion", scope = DocumentoReferenciado.class)
    public JAXBElement<ArrayOfstring> createDocumentoReferenciadoDescripcion(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CargosDescuentosDescripcion_QNAME, ArrayOfstring.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoEstatusDocumento", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoCodigoEstatusDocumento(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoCodigoEstatusDocumento_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoDocumentoCodigo", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoTipoDocumentoCodigo(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoTipoDocumentoCodigo_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroDocumento", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoNumeroDocumento(String value) {
        return new JAXBElement<String>(_AutorizadoNumeroDocumento_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaInicioValidez", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoFechaInicioValidez(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoFechaInicioValidez_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoCUFE", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoTipoCUFE(String value) {
        return new JAXBElement<String>(_OrdenDeCompraTipoCUFE_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaFinValidez", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoFechaFinValidez(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoFechaFinValidez_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "conceptoRecaudo", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoConceptoRecaudo(String value) {
        return new JAXBElement<String>(_DocumentoReferenciadoConceptoRecaudo_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fecha", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoFecha(String value) {
        return new JAXBElement<String>(_OrdenDeCompraFecha_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoDocumento", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoTipoDocumento(String value) {
        return new JAXBElement<String>(_FacturaGeneralTipoDocumento_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monto", scope = DocumentoReferenciado.class)
    public JAXBElement<String> createDocumentoReferenciadoMonto(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaMonto_QNAME, String.class, DocumentoReferenciado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombre", scope = DatosExtras.class)
    public JAXBElement<String> createDatosExtrasNombre(String value) {
        return new JAXBElement<String>(_ExtensibleNombre_QNAME, String.class, DatosExtras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "valor", scope = DatosExtras.class)
    public JAXBElement<String> createDatosExtrasValor(String value) {
        return new JAXBElement<String>(_ExtensibleValor_QNAME, String.class, DatosExtras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno1", scope = DatosExtras.class)
    public JAXBElement<String> createDatosExtrasCodigoInterno1(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoInterno1_QNAME, String.class, DatosExtras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoInterno2", scope = DatosExtras.class)
    public JAXBElement<String> createDatosExtrasCodigoInterno2(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoInterno2_QNAME, String.class, DatosExtras.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Tributos.class)
    public JAXBElement<ArrayOfExtensible> createTributosExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Tributos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoImpuesto", scope = Tributos.class)
    public JAXBElement<String> createTributosCodigoImpuesto(String value) {
        return new JAXBElement<String>(_TributosCodigoImpuesto_QNAME, String.class, Tributos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "comentario", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoComentario(String value) {
        return new JAXBElement<String>(_DatosEventoComentario_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "referenciaAnticipo", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoReferenciaAnticipo(String value) {
        return new JAXBElement<String>(_CondicionDePagoReferenciaAnticipo_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = CondicionDePago.class)
    public JAXBElement<ArrayOfExtensible> createCondicionDePagoExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "montoMulta", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoMontoMulta(String value) {
        return new JAXBElement<String>(_CondicionDePagoMontoMulta_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "duracionPeriodoMedida", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoDuracionPeriodoMedida(String value) {
        return new JAXBElement<String>(_CondicionDePagoDuracionPeriodoMedida_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "montoPenalidad", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoMontoPenalidad(String value) {
        return new JAXBElement<String>(_CondicionDePagoMontoPenalidad_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "periodoDesde", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoPeriodoDesde(String value) {
        return new JAXBElement<String>(_CondicionDePagoPeriodoDesde_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaVencimiento", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoFechaVencimiento(String value) {
        return new JAXBElement<String>(_FacturaGeneralFechaVencimiento_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "periodoHasta", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoPeriodoHasta(String value) {
        return new JAXBElement<String>(_CondicionDePagoPeriodoHasta_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "medioPagoAsociado", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoMedioPagoAsociado(String value) {
        return new JAXBElement<String>(_CondicionDePagoMedioPagoAsociado_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "identificador", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoIdentificador(String value) {
        return new JAXBElement<String>(_CondicionDePagoIdentificador_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoEvento", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoCodigoEvento(String value) {
        return new JAXBElement<String>(_DatosEventoCodigoEvento_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "porcentajePago", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoPorcentajePago(String value) {
        return new JAXBElement<String>(_CondicionDePagoPorcentajePago_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "duracionPeriodo", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoDuracionPeriodo(String value) {
        return new JAXBElement<String>(_CondicionDePagoDuracionPeriodo_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "porcentajeDescuento", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoPorcentajeDescuento(String value) {
        return new JAXBElement<String>(_CondicionDePagoPorcentajeDescuento_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monto", scope = CondicionDePago.class)
    public JAXBElement<String> createCondicionDePagoMonto(String value) {
        return new JAXBElement<String>(_TerminosDeEntregaMonto_QNAME, String.class, CondicionDePago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = DescargaPDF.class)
    public JAXBElement<String> createDescargaPDFTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, DescargaPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = DescargaPDF.class)
    public JAXBElement<String> createDescargaPDFTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, DescargaPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "documento", scope = DescargaPDF.class)
    public JAXBElement<String> createDescargaPDFDocumento(String value) {
        return new JAXBElement<String>(_DescargaXMLDocumento_QNAME, String.class, DescargaPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "mensajePersonalizado", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaMensajePersonalizado(String value) {
        return new JAXBElement<String>(_DestinatarioMensajePersonalizado_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "LeidoEstatus", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaLeidoEstatus(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaLeidoEstatus_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "entregaEstatus", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaEntregaEstatus(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaEntregaEstatus_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "recepcionEmailIPAddress", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaRecepcionEmailIPAddress(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaRecepcionEmailIPAddress_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "LeidoFecha", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaLeidoFecha(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaLeidoFecha_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "LeidoEmailIPAddress", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaLeidoEmailIPAddress(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaLeidoEmailIPAddress_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "entregaEstatusDescripcion", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaEntregaEstatusDescripcion(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaEntregaEstatusDescripcion_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nitProveedorReceptor", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaNitProveedorReceptor(String value) {
        return new JAXBElement<String>(_DestinatarioNitProveedorReceptor_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "entregaFecha", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaEntregaFecha(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaEntregaFecha_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "recepcionEmailEstatus", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaRecepcionEmailEstatus(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaRecepcionEmailEstatus_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "recepcionEmailComentario", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaRecepcionEmailComentario(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaRecepcionEmailComentario_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "recepcionEmailFecha", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaRecepcionEmailFecha(String value) {
        return new JAXBElement<String>(_HistorialDeEntregaRecepcionEmailFecha_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefono", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaTelefono(String value) {
        return new JAXBElement<String>(_AutorizadoTelefono_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "canalDeEntrega", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaCanalDeEntrega(String value) {
        return new JAXBElement<String>(_DestinatarioCanalDeEntrega_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "email", scope = HistorialDeEntrega.class)
    public JAXBElement<ArrayOfstring> createHistorialDeEntregaEmail(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_AutorizadoEmail_QNAME, ArrayOfstring.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaProgramada", scope = HistorialDeEntrega.class)
    public JAXBElement<String> createHistorialDeEntregaFechaProgramada(String value) {
        return new JAXBElement<String>(_DestinatarioFechaProgramada_QNAME, String.class, HistorialDeEntrega.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadPDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DescargaPDFResult", scope = DescargaPDFResponse.class)
    public JAXBElement<DownloadPDFResponse> createDescargaPDFResponseDescargaPDFResult(DownloadPDFResponse value) {
        return new JAXBElement<DownloadPDFResponse>(_DescargaPDFResponseDescargaPDFResult_QNAME, DownloadPDFResponse.class, DescargaPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "regimen", scope = Obligaciones.class)
    public JAXBElement<String> createObligacionesRegimen(String value) {
        return new JAXBElement<String>(_ObligacionesRegimen_QNAME, String.class, Obligaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "obligaciones", scope = Obligaciones.class)
    public JAXBElement<String> createObligacionesObligaciones(String value) {
        return new JAXBElement<String>(_ObligacionesObligaciones_QNAME, String.class, Obligaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Obligaciones.class)
    public JAXBElement<ArrayOfExtensible> createObligacionesExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Obligaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacturaGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "factura", scope = Enviar.class)
    public JAXBElement<FacturaGeneral> createEnviarFactura(FacturaGeneral value) {
        return new JAXBElement<FacturaGeneral>(_EnviarFactura_QNAME, FacturaGeneral.class, Enviar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenPassword", scope = Enviar.class)
    public JAXBElement<String> createEnviarTokenPassword(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenPassword_QNAME, String.class, Enviar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "tokenEmpresa", scope = Enviar.class)
    public JAXBElement<String> createEnviarTokenEmpresa(String value) {
        return new JAXBElement<String>(_DescargaXMLTokenEmpresa_QNAME, String.class, Enviar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "adjuntos", scope = Enviar.class)
    public JAXBElement<String> createEnviarAdjuntos(String value) {
        return new JAXBElement<String>(_EnvioCorreoAdjuntos_QNAME, String.class, Enviar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = DatosDelTransportista.class)
    public JAXBElement<ArrayOfExtensible> createDatosDelTransportistaExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "transportadorNumeroDocumentoDV", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTransportadorNumeroDocumentoDV(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaTransportadorNumeroDocumentoDV_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccionResponsableEntrega", scope = DatosDelTransportista.class)
    public JAXBElement<Direccion> createDatosDelTransportistaDireccionResponsableEntrega(Direccion value) {
        return new JAXBElement<Direccion>(_DatosDelTransportistaDireccionResponsableEntrega_QNAME, Direccion.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroIdentificacion", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaNumeroIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroIdentificacion_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tipoIdentificacion", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTipoIdentificacion(String value) {
        return new JAXBElement<String>(_InformacionLegalTipoIdentificacion_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "transportadorNombre", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTransportadorNombre(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaTransportadorNombre_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "transportadorTipoIdentificacion", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTransportadorTipoIdentificacion(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaTransportadorTipoIdentificacion_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "prefijoFacturacion", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaPrefijoFacturacion(String value) {
        return new JAXBElement<String>(_InformacionLegalPrefijoFacturacion_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nota", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaNota(String value) {
        return new JAXBElement<String>(_FacturaDetalleNota_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTributos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "detallesTributarios", scope = DatosDelTransportista.class)
    public JAXBElement<ArrayOfTributos> createDatosDelTransportistaDetallesTributarios(ArrayOfTributos value) {
        return new JAXBElement<ArrayOfTributos>(_ClienteDetallesTributarios_QNAME, ArrayOfTributos.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefono", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTelefono(String value) {
        return new JAXBElement<String>(_AutorizadoTelefono_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "transportadorDireccion", scope = DatosDelTransportista.class)
    public JAXBElement<Direccion> createDatosDelTransportistaTransportadorDireccion(Direccion value) {
        return new JAXBElement<Direccion>(_DatosDelTransportistaTransportadorDireccion_QNAME, Direccion.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "email", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaEmail(String value) {
        return new JAXBElement<String>(_AutorizadoEmail_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "telefax", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTelefax(String value) {
        return new JAXBElement<String>(_AutorizadoTelefax_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroIdentificacionDV", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaNumeroIdentificacionDV(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroIdentificacionDV_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "indicadordeCuidado", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaIndicadordeCuidado(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaIndicadordeCuidado_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfObligaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "responsabilidadesRut", scope = DatosDelTransportista.class)
    public JAXBElement<ArrayOfObligaciones> createDatosDelTransportistaResponsabilidadesRut(ArrayOfObligaciones value) {
        return new JAXBElement<ArrayOfObligaciones>(_ClienteResponsabilidadesRut_QNAME, ArrayOfObligaciones.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "indicadordeAtencion", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaIndicadordeAtencion(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaIndicadordeAtencion_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "transportadorNumeroDocumento", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaTransportadorNumeroDocumento(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaTransportadorNumeroDocumento_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreContacto", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaNombreContacto(String value) {
        return new JAXBElement<String>(_AutorizadoNombreContacto_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreResponsableEntrega", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaNombreResponsableEntrega(String value) {
        return new JAXBElement<String>(_DatosDelTransportistaNombreResponsableEntrega_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroMatriculaMercantil", scope = DatosDelTransportista.class)
    public JAXBElement<String> createDatosDelTransportistaNumeroMatriculaMercantil(String value) {
        return new JAXBElement<String>(_InformacionLegalNumeroMatriculaMercantil_QNAME, String.class, DatosDelTransportista.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "minutosLongitud", scope = Coordenadas.class)
    public JAXBElement<String> createCoordenadasMinutosLongitud(String value) {
        return new JAXBElement<String>(_CoordenadasMinutosLongitud_QNAME, String.class, Coordenadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "orientacionLongitud", scope = Coordenadas.class)
    public JAXBElement<String> createCoordenadasOrientacionLongitud(String value) {
        return new JAXBElement<String>(_CoordenadasOrientacionLongitud_QNAME, String.class, Coordenadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "orientacionLatitud", scope = Coordenadas.class)
    public JAXBElement<String> createCoordenadasOrientacionLatitud(String value) {
        return new JAXBElement<String>(_CoordenadasOrientacionLatitud_QNAME, String.class, Coordenadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "gradosLatitud", scope = Coordenadas.class)
    public JAXBElement<String> createCoordenadasGradosLatitud(String value) {
        return new JAXBElement<String>(_CoordenadasGradosLatitud_QNAME, String.class, Coordenadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "gradosLongitud", scope = Coordenadas.class)
    public JAXBElement<String> createCoordenadasGradosLongitud(String value) {
        return new JAXBElement<String>(_CoordenadasGradosLongitud_QNAME, String.class, Coordenadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "minutosLatitud", scope = Coordenadas.class)
    public JAXBElement<String> createCoordenadasMinutosLatitud(String value) {
        return new JAXBElement<String>(_CoordenadasMinutosLatitud_QNAME, String.class, Coordenadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "hash", scope = DownloadPDFResponse.class)
    public JAXBElement<String> createDownloadPDFResponseHash(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseHash_QNAME, String.class, DownloadPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cufe", scope = DownloadPDFResponse.class)
    public JAXBElement<String> createDownloadPDFResponseCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseCufe_QNAME, String.class, DownloadPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "documento", scope = DownloadPDFResponse.class)
    public JAXBElement<String> createDownloadPDFResponseDocumento(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseDocumento_QNAME, String.class, DownloadPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = DownloadPDFResponse.class)
    public JAXBElement<String> createDownloadPDFResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, DownloadPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = DownloadPDFResponse.class)
    public JAXBElement<String> createDownloadPDFResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, DownloadPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoCufe", scope = DownloadPDFResponse.class)
    public JAXBElement<String> createDownloadPDFResponseTipoCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseTipoCufe_QNAME, String.class, DownloadPDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "calleAdicional", scope = Direccion.class)
    public JAXBElement<String> createDireccionCalleAdicional(String value) {
        return new JAXBElement<String>(_DireccionCalleAdicional_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Direccion.class)
    public JAXBElement<ArrayOfExtensible> createDireccionExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "correccionHusoHorario", scope = Direccion.class)
    public JAXBElement<String> createDireccionCorreccionHusoHorario(String value) {
        return new JAXBElement<String>(_DireccionCorreccionHusoHorario_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "aCuidadoDe", scope = Direccion.class)
    public JAXBElement<String> createDireccionACuidadoDe(String value) {
        return new JAXBElement<String>(_DireccionACuidadoDe_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ubicacion", scope = Direccion.class)
    public JAXBElement<String> createDireccionUbicacion(String value) {
        return new JAXBElement<String>(_DireccionUbicacion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "bloque", scope = Direccion.class)
    public JAXBElement<String> createDireccionBloque(String value) {
        return new JAXBElement<String>(_DireccionBloque_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroParcela", scope = Direccion.class)
    public JAXBElement<String> createDireccionNumeroParcela(String value) {
        return new JAXBElement<String>(_DireccionNumeroParcela_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCoordenadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "localizacion", scope = Direccion.class)
    public JAXBElement<ArrayOfCoordenadas> createDireccionLocalizacion(ArrayOfCoordenadas value) {
        return new JAXBElement<ArrayOfCoordenadas>(_DireccionLocalizacion_QNAME, ArrayOfCoordenadas.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "subDivision", scope = Direccion.class)
    public JAXBElement<String> createDireccionSubDivision(String value) {
        return new JAXBElement<String>(_DireccionSubDivision_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "lenguaje", scope = Direccion.class)
    public JAXBElement<String> createDireccionLenguaje(String value) {
        return new JAXBElement<String>(_DireccionLenguaje_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "zonaPostal", scope = Direccion.class)
    public JAXBElement<String> createDireccionZonaPostal(String value) {
        return new JAXBElement<String>(_DireccionZonaPostal_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "habitacion", scope = Direccion.class)
    public JAXBElement<String> createDireccionHabitacion(String value) {
        return new JAXBElement<String>(_DireccionHabitacion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "pais", scope = Direccion.class)
    public JAXBElement<String> createDireccionPais(String value) {
        return new JAXBElement<String>(_DireccionPais_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "direccion", scope = Direccion.class)
    public JAXBElement<String> createDireccionDireccion(String value) {
        return new JAXBElement<String>(_AutorizadoDireccion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "calle", scope = Direccion.class)
    public JAXBElement<String> createDireccionCalle(String value) {
        return new JAXBElement<String>(_DireccionCalle_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "departamentoOrg", scope = Direccion.class)
    public JAXBElement<String> createDireccionDepartamentoOrg(String value) {
        return new JAXBElement<String>(_DireccionDepartamentoOrg_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "municipio", scope = Direccion.class)
    public JAXBElement<String> createDireccionMunicipio(String value) {
        return new JAXBElement<String>(_DireccionMunicipio_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "distrito", scope = Direccion.class)
    public JAXBElement<String> createDireccionDistrito(String value) {
        return new JAXBElement<String>(_DireccionDistrito_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "piso", scope = Direccion.class)
    public JAXBElement<String> createDireccionPiso(String value) {
        return new JAXBElement<String>(_DireccionPiso_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "codigoDepartamento", scope = Direccion.class)
    public JAXBElement<String> createDireccionCodigoDepartamento(String value) {
        return new JAXBElement<String>(_DireccionCodigoDepartamento_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "region", scope = Direccion.class)
    public JAXBElement<String> createDireccionRegion(String value) {
        return new JAXBElement<String>(_DireccionRegion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "aLaAtencionDe", scope = Direccion.class)
    public JAXBElement<String> createDireccionALaAtencionDe(String value) {
        return new JAXBElement<String>(_DireccionALaAtencionDe_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "departamento", scope = Direccion.class)
    public JAXBElement<String> createDireccionDepartamento(String value) {
        return new JAXBElement<String>(_DireccionDepartamento_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "nombreEdificio", scope = Direccion.class)
    public JAXBElement<String> createDireccionNombreEdificio(String value) {
        return new JAXBElement<String>(_DireccionNombreEdificio_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "buzon", scope = Direccion.class)
    public JAXBElement<String> createDireccionBuzon(String value) {
        return new JAXBElement<String>(_DireccionBuzon_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "ciudad", scope = Direccion.class)
    public JAXBElement<String> createDireccionCiudad(String value) {
        return new JAXBElement<String>(_DireccionCiudad_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "numeroEdificio", scope = Direccion.class)
    public JAXBElement<String> createDireccionNumeroEdificio(String value) {
        return new JAXBElement<String>(_DireccionNumeroEdificio_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "nombre", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseNombre(String value) {
        return new JAXBElement<String>(_DocumentResponseNombre_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "hash", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseHash(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseHash_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cufe", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseCufe_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "documento", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseDocumento(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseDocumento_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoCufe", scope = DownloadXMLResponse.class)
    public JAXBElement<String> createDownloadXMLResponseTipoCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseTipoCufe_QNAME, String.class, DownloadXMLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fechaRespuesta", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseFechaRespuesta(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseFechaRespuesta_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "hash", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseHash(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseHash_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "cufe", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseCufe_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "consecutivoDocumentoEvento", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseConsecutivoDocumentoEvento(String value) {
        return new JAXBElement<String>(_EventoResponseConsecutivoDocumentoEvento_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "tipoCufe", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseTipoCufe(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseTipoCufe_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "xml", scope = EventoResponse.class)
    public JAXBElement<String> createEventoResponseXml(String value) {
        return new JAXBElement<String>(_DocumentResponseXml_QNAME, String.class, EventoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoliosRemainingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FoliosRestantesResult", scope = FoliosRestantesResponse.class)
    public JAXBElement<FoliosRemainingResponse> createFoliosRestantesResponseFoliosRestantesResult(FoliosRemainingResponse value) {
        return new JAXBElement<FoliosRemainingResponse>(_FoliosRestantesResponseFoliosRestantesResult_QNAME, FoliosRemainingResponse.class, FoliosRestantesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "hash", scope = ContenedorResponse.class)
    public JAXBElement<String> createContenedorResponseHash(String value) {
        return new JAXBElement<String>(_DescargarEventoResponseHash_QNAME, String.class, ContenedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "mensaje", scope = ContenedorResponse.class)
    public JAXBElement<String> createContenedorResponseMensaje(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseMensaje_QNAME, String.class, ContenedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "resultado", scope = ContenedorResponse.class)
    public JAXBElement<String> createContenedorResponseResultado(String value) {
        return new JAXBElement<String>(_LoadCertificateResponseResultado_QNAME, String.class, ContenedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "contenedorXml", scope = ContenedorResponse.class)
    public JAXBElement<String> createContenedorResponseContenedorXml(String value) {
        return new JAXBElement<String>(_ContenedorResponseContenedorXml_QNAME, String.class, ContenedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Response", name = "fecha", scope = ContenedorResponse.class)
    public JAXBElement<String> createContenedorResponseFecha(String value) {
        return new JAXBElement<String>(_ContenedorResponseFecha_QNAME, String.class, ContenedorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "baseMonedaOrigen", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaBaseMonedaOrigen(String value) {
        return new JAXBElement<String>(_TasaDeCambioBaseMonedaOrigen_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<ArrayOfExtensible> createTasaDeCambioAlternativaExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "indicadorDeTasa", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaIndicadorDeTasa(String value) {
        return new JAXBElement<String>(_TasaDeCambioIndicadorDeTasa_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monedaDestino", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaMonedaDestino(String value) {
        return new JAXBElement<String>(_TasaDeCambioMonedaDestino_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "baseMonedaDestino", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaBaseMonedaDestino(String value) {
        return new JAXBElement<String>(_TasaDeCambioBaseMonedaDestino_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "operadorCalculo", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaOperadorCalculo(String value) {
        return new JAXBElement<String>(_TasaDeCambioOperadorCalculo_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaDeTasaDeCambio", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaFechaDeTasaDeCambio(String value) {
        return new JAXBElement<String>(_TasaDeCambioFechaDeTasaDeCambio_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "monedaOrigen", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaMonedaOrigen(String value) {
        return new JAXBElement<String>(_TasaDeCambioMonedaOrigen_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "tasaDeCambio", scope = TasaDeCambioAlternativa.class)
    public JAXBElement<String> createTasaDeCambioAlternativaTasaDeCambio(String value) {
        return new JAXBElement<String>(_TasaDeCambioTasaDeCambio_QNAME, String.class, TasaDeCambioAlternativa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnvioCorreoResult", scope = EnvioCorreoResponse.class)
    public JAXBElement<SendEmailResponse> createEnvioCorreoResponseEnvioCorreoResult(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_EnvioCorreoResponseEnvioCorreoResult_QNAME, SendEmailResponse.class, EnvioCorreoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtensible }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "extras", scope = Anticipos.class)
    public JAXBElement<ArrayOfExtensible> createAnticiposExtras(ArrayOfExtensible value) {
        return new JAXBElement<ArrayOfExtensible>(_MediosDePagoExtras_QNAME, ArrayOfExtensible.class, Anticipos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "id", scope = Anticipos.class)
    public JAXBElement<String> createAnticiposId(String value) {
        return new JAXBElement<String>(_AnticiposId_QNAME, String.class, Anticipos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "montoPagado", scope = Anticipos.class)
    public JAXBElement<String> createAnticiposMontoPagado(String value) {
        return new JAXBElement<String>(_AnticiposMontoPagado_QNAME, String.class, Anticipos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechadePago", scope = Anticipos.class)
    public JAXBElement<String> createAnticiposFechadePago(String value) {
        return new JAXBElement<String>(_AnticiposFechadePago_QNAME, String.class, Anticipos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "fechaDeRecibido", scope = Anticipos.class)
    public JAXBElement<String> createAnticiposFechaDeRecibido(String value) {
        return new JAXBElement<String>(_AnticiposFechaDeRecibido_QNAME, String.class, Anticipos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "instrucciones", scope = Anticipos.class)
    public JAXBElement<String> createAnticiposInstrucciones(String value) {
        return new JAXBElement<String>(_AnticiposInstrucciones_QNAME, String.class, Anticipos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceSoap.UBL2._0.Models.Object", name = "horaDePago", scope = Anticipos.class)
    public JAXBElement<String> createAnticiposHoraDePago(String value) {
        return new JAXBElement<String>(_AnticiposHoraDePago_QNAME, String.class, Anticipos.class, value);
    }

}
