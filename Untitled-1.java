// --SET ENCABEZADO-- //


// IN
String hInvoicenum, String hInvoiceTypeLookupCode, String hInvoiceDate, String hVendorNum, Integer hMontoEncabezadoEn, String hDescription, String hPaymentMethodLookupCode, Integer hOperatingUnitIdEn, String hOperatingUnitEn, String hCveuserfinEn, String hAgrupaNtEn, String hInvIncludesPrepayFlagEn, String hPrepaynumEn, String hExclusivePaymentFlagEn, Integer hPrepayAmountEn, String hPrepayGl_dateEn, String hAttribute8En, String uuId, Integer idAnticipo

private String hInvoicenum;
private String hInvoiceTypeLookupCode;
private String hInvoiceDate;
private String hVendorNum;
private Integer hMontoEncabezadoEn;
private String hDescription;
private String hPaymentMethodLookupCode;
private Integer hOperatingUnitIdEn;
private String hOperatingUnitEn;
private String hCveuserfinEn;
private String hAgrupaNtEn;
private String hInvIncludesPrepayFlagEn;
private String hPrepaynumEn;
private String hExclusivePaymentFlagEn;
private Integer hPrepayAmountEn;
private String hPrepayGl_dateEn;
private String hAttribute8En;
private String uuId;
private Integer idAnticipo;

// OUT

String pMensajeRes;
String hInvoicenumRes;
String lnConsecutivoRes;
String hInvoiceTypeLookupCodeRes;
String hVendorNumRes;
String hOperatingUnitRes;
String estatusEnc;




// --LINEAS - FACTURAS-- //

String hInvoicenumLn, String hInvoiceTypeLookupCodeLn, String hVendorNumLn, String hOperatingUnitEnLn, Integer lNconsecutivoLn, Integer linea, Integer lnMontolinEn, String lnDistCodeConcatenated, String lnDescription, String lnTaxRateCode

//IN 
String hInvoicenumLn;
String hInvoiceTypeLookupCodeLn;
String hVendorNumLn;
String hOperatingUnitEnLn;
Integer lNconsecutivoLn;
Integer linea;
Integer lnMontolinEn;
String lnDistCodeConcatenated;
String lnDescription;
String lnTaxRateCode;

//OUT
String pMensajeResLn;
String estatusLn; 
Integer lnConsecutivoLnRes;



// --VALIDA ENC-LN --

String hInvoicenumLn, String hInvoiceTypeLookupCodeLn, String hOperatingUnitEnLn, Integer lnConsecutivoLn, String lvclabeLn, Integer userIdEbs

// IN
String hInvoicenumLn;
String hInvoiceTypeLookupCodeLn;
String hOperatingUnitEnLn;
Integer lnConsecutivoLn;
String lvclabeLn;
Integer userIdEbs;


// OUT
String pMensajeResLn;
String invoiceNumRes;
String anio;
String lvClabeRes;
Integer lnDepKeyRes;
String newStatus;
Integer lnInvoiceIdRes;
String lvSegment12Res;
Integer lnUserKeyRes;
Integer userIdEbsRes;