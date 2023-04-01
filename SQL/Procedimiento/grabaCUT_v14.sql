CREATE DEFINER=`pjuarez`@`%` PROCEDURE `grabaCUT`(ticket int)
BEGIN
select CAST(ticket as UNSIGNED)  as 'CUT_ID',  
(select CAST(di1.containerId  as UNSIGNED) as containerId 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue = ticket
                            )
and di1.name = 'comp_TXT_CUT_ID' ) as 'CUT_ID_TRAMITE', 
(select CONCAT(sd.TIPO,'-',sd.NUMERO_DOCUMENTO,'-',sd.ANO) as Expediente
from ventanillaunica.secuencia_documentos sd 
where sd.INST_UUID_ in (Select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue = ticket
                            )
                                                      ) as 'CUT_ID_TRAMITE_EE',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue = ticket
                            )
and di1.name = 'comp_TXT_CUT_MES_ID' ) as 'CUT_MES_ID',
(select CAST(di1.clobValue as char(50))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_MES_EMAIL')  as 'CUT_MES_EMAIL',
(select CAST(di1.clobValue  as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ARE_ID')  as 'CUT_ARE_ID',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CUENTA')  as 'CUT_CUENTA',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CLI_TYPE')  as 'CUT_CLI_TIPO',
(select CAST(di1.clobValue as char(40))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_NOMBRE_VENDEDOR_1')  as 'CUT_CLI_NOMBRE',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CLI_NRO_DOCUMENTO_D')  as 'CUT_CLI_NRO_DOCUMENTO_D',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CLI_NRO_DOCUMENTO_C')  as 'CUT_CLI_NRO_DOCUMENTO_C',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DCA_CODIGO')  as 'CUT_DCA_CODIGO',
(select CAST(di1.clobValue  as UNSIGNED) 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DIC_CODIGO')  as 'CUT_DIC_CODIGO',
(select CAST(di1.intValue  as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_CUT_SCC_CODIGO')  as 'CUT_SCC_CODIGO',
(select CAST(di1.intValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_CUT_MNA_CODIGO')  as 'CUT_MNA_CODIGO',
(select CAST(di1.intValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_CUT_PARCELA')  as 'CUT_PARCELA',
(select CAST(di1.intValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_CUT_SUBPARCELA')  as 'CUT_SUBPARCELA',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ASIENTO')  as 'CUT_ASIENTO',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_MATRICULA_TOMO')  as 'CUT_MATRICULA_TOMO',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue = ticket
                            )
and di1.name = 'comp_TXT_CUT_DPTO_MATRICULA' ) as 'CUT_DPTO_MATRICULA',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DPTO_MATRICULA_D')  as 'CUT_DPTO_MATRICULA_D',
(select date_format(FROM_UNIXTIME(di1.longValue / 1000), '%d-%m-%Y') as longValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DATE_CUT_INSC_DOM_FECHA')  as 'CUT_INSC_DOM_FECHA',
(select CAST(di1.clobValue as char(80))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_NOM1')  as 'CUT_TRANSFIERE_NOM1',
(select CAST(di1.clobValue as char(20)) 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_DNI1')  as 'CUT_TRANSFIERE_DNI1',
(select CAST(di1.clobValue as char(80))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_NOM2')  as 'CUT_TRANSFIERE_NOM2',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_DNI2')  as 'CUT_TRANSFIERE_DNI2',
(select CAST(di1.clobValue as char(80))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_NOM3')  as 'CUT_TRANSFIERE_NOM3',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_DNI3')  as 'CUT_TRANSFIERE_DNI3',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CUENTA_TIPO_CLIENTE')  as 'CUT_CUENTATIPOCLIENTE',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ID_PERSONA_FISICAT')  as 'CUT_IDPERSONAFISICAT',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DEP_CODIGO')  as 'CUT_IDPERSONAFISICAA',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DIS_ID')  as 'CUT_IDDISTRITOFISICO',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ID_PERSONA_FISICA_A')  as 'CUT_CLI_TYPE',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_RA_tipoPersonaCUT')  as 'CUT_CLI_TYPE_D',
(select CAST(di1.clobValue as char(80))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ADQUIERE_NOM1')  as 'CUT_ADQUIERE_NOM1',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ADQUIERE_DNI1')  as 'CUT_ADQUIERE_DNI1',
(select CAST(di1.doubleValue  as decimal(6,3))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_ADQUIERE_PORC1')  as 'CUT_ADQUIERE_PORC1',
(select CAST(di1.clobValue as char(80))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ADQUIERE_NOM2')  as 'CUT_ADQUIERE_NOM2',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ADQUIERE_DNI2')  as 'CUT_ADQUIERE_DNI2',
(select CAST(di1.doubleValue  as decimal(6,3))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_ADQUIERE_PORC2')  as 'CUT_ADQUIERE_PORC2',
(select CAST(di1.clobValue as char(80))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ADQUIERE_NOM3')  as 'CUT_ADQUIERE_NOM3',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_ADQUIERE_DNI3')  as 'CUT_ADQUIERE_DNI3',
(select CAST(di1.doubleValue  as decimal(6,3))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_ADQUIERE_PORC3')  as 'CUT_ADQUIERE_PORC3',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DEP_CODIGO')  as 'CUT_DEP_CODIGO',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DIS_ID')  as 'CUT_DIS_ID',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DIS_ID_D')  as 'CUT_DIS_ID_D',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CAL_ID')  as 'CUT_CAL_ID',
(select CAST(di1.intValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_CUT_PUERTA')  as 'CUT_PUERTA',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_BAR_ID')  as 'CUT_BAR_ID',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DOM_MANZANA')  as 'CUT_DOM_MANZANA',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DOM_LOTE')  as 'CUT_DOM_LOTE',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DOM_FRACCION')  as 'CUT_DOM_FRACCION',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CPA_ID')  as 'CUT_CPA_ID',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_CMB_codPostalFis')  as 'CUT_CPA_ID_D',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_NRO_PLANO')  as 'CUT_NRO_PLANO',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_DEP_CODIGO')  as 'CUT_P_DEP_CODIGO',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_DIS_ID')  as 'CUT_P_DIS_ID',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_CAL_ID')  as 'CUT_P_CAL_ID',
(select CAST(di1.clobValue as char(40))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_CAL_ID_D')  as 'CUT_P_CAL_ID_D',
(select CAST(di1.intValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_CUT_P_PUERTA')  as 'CUT_P_PUERTA',
(select CAST(di1.clobValue as UNSIGNED) 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_BAR_ID')  as 'CUT_P_BAR_ID',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_DOM_MANZANA')  as 'CUT_P_DOM_MANZANA',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_DOM_LOTE')  as 'CUT_P_DOM_LOTE',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_FRACCION')  as 'CUT_P_DOM_FRACCION',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_CPA_ID')  as 'CUT_P_CPA_ID',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_P_CPA_ID_D')  as 'CUT_P_CPA_ID_D',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_SUP_INM_TITULO')  as 'CUT_SUP_INM_TITULO',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_SUP_INM_PLANO')  as 'CUT_SUP_INM_PLANO',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_SUP_TRAND_TITULO')  as 'CUT_SUP_TRANF_TITULO',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_SUP_TRANF_PLANO')  as 'CUT_SUP_TRANF_PLANO',
(select CAST(di1.clobValue as char(50))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_PH_CAL_EDIFICIO')  as 'CUT_PH_CAL_EDIFICIO',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_PH_CAL_ID')  as 'CUT_PH_CAL_ID',
(select CAST(di1.clobValue as char(50))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_PH_CAL_ID_D')  as 'CUT_PH_CAL_ID_D',
(select CAST(di1.clobValue as UNSIGNED)
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_PH_PUERTA')  as 'CUT_PH_PUERTA',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_PH_PISO')  as 'CUT_PH_PISO',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DPC_UNIDAD')  as 'CUT_DPC_UNIDAD',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DPC_DESIGNACION')  as 'CUT_DPC_DESIGNACION',
(select CAST(di1.clobValue as char(20))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DPC_DESTINO')  as 'CUT_DPC_DESTINO',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_PH_PROPIA')  as 'CUT_PH_PROPIA',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_PH_COMUN')  as 'CUT_PH_COMUN',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_PH_TOTAL')  as 'CUT_PH_TOTAL',
(select di1.doubleValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DOU_CUT_PH_PORCENTAJE')  as 'CUT_PH_PORCENTAJE',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_NRO_ESCRITURA')  as 'CUT_NRO_ESCRITURA',
(select CAST(di1.clobValue as char(10))
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_NRO_FOLIO')  as 'CUT_NRO_FOLIO',
(select date_format(FROM_UNIXTIME(di1.longValue / 1000), '%d-%m-%Y') as longValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DATE_CUT_FEC_ESCRITURA')  as 'CUT_FEC_ESCRITURA',
CAST(concat ((select us.userName from bonita.user_ us where us.id in ( select fi.assigneeId from bonita.arch_flownode_instance fi where fi.rootContainerId = (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue = ticket
                            )
and fi.name = 'Solicitud' and fi.kind = 'user' and fi.stateId = 2) ),'_', (select di1.clobValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue = ticket
                            )
and di1.name = 'comp_TXT_CUT_MES_ID' ) )as char(15))as 'CUT_USR_ALTA', 
(select date_format(FROM_UNIXTIME(di1.longValue / 1000), '%d-%m-%Y') as longValue 
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_DA_fechaCUT')  as 'CUT_FEC_ALTA',
'' as 'CUT_USR_MOD',
'' as 'CUT_FEC_MOD',
'' as 'CUT_USR_BAJA',
'' as 'CUT_FEC_BAJA',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_VERSION_SAYGES')  as 'VERSION_SAYGES',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_APELLIDO_VENDEDOR_1')  as 'CUT_TRANSFIERE_APE1',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_TRANSFIERE_DNI1')  as 'CUT_TRANSFIERE_CUIT1',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_TipoIVAVendedor1')  as 'CUT_TRANSFIERE_TRE_COD',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_APELLIDO_COMPRADOR_1')  as 'CUT_ADQUIERE_APE1',
(select CAST(di1.clobValue as char(13)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CUIT_COMPRADOR_1')  as 'CUT_ADQUIERE_CUIT1',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_APELLIDO_COMPRADOR_2')  as 'CUT_ADQUIERE_APE2',
(select CAST(di1.clobValue as char(13)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CUIT_COMPRADOR_2')  as 'CUT_ADQUIERE_CUIT2',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_APELLIDO_COMPRADOR_3')  as 'CUT_ADQUIERE_APE3',
(select CAST(di1.clobValue as char(13)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_CUIT_COMPRADOR_3')  as 'CUT_ADQUIERE_CUIT3',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_TipoIVAComprador3')  as 'CUT_ADQUIERE_TRE_COD',
(select CAST(di1.clobValue as char(10)) as clobValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_TXT_CUT_DTO_PH')  as 'CUT_PH_DTO',
(select CAST(di1.intValue as UNSIGNED) as intValue
from bonita.data_instance di1 
where di1.containerId in (
                                               select di.containerId 
                                                      from bonita.data_instance di 
                                               where di.name = 'comp_TXT_CUT_ID' 
                            and di.clobValue =  ticket
                            )
and di1.name = 'comp_INT_DV_CASTRO')  as 'CUT_DV_CASTRO'
FROM DUAL;
END