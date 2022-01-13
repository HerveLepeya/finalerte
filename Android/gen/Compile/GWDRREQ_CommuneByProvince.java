/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_CommuneByProvince
 * Date : 19/10/2021 11:33:56
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.database.hf.requete.parsing.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDRREQ_CommuneByProvince extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_CommuneByProvince";
}
public String getCodeSQLOriginal()
{
return " SELECT  t_territoire.TerritoireId AS TerritoireId,\t t_territoire.LibelleTerritoire AS LibelleTerritoire,\t t_territoire.VilleId AS VilleId  FROM  t_territoire  WHERE   t_territoire.VilleId = {ParamVilleId#0}  ORDER BY  LibelleTerritoire ASC";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_TerritoireId = new Rubrique();
rub_TerritoireId.setNom("TerritoireId");
rub_TerritoireId.setAlias("TerritoireId");
rub_TerritoireId.setNomFichier("t_territoire");
rub_TerritoireId.setAliasFichier("t_territoire");
varSelect.ajouterElement(rub_TerritoireId);
Rubrique rub_LibelleTerritoire = new Rubrique();
rub_LibelleTerritoire.setNom("LibelleTerritoire");
rub_LibelleTerritoire.setAlias("LibelleTerritoire");
rub_LibelleTerritoire.setNomFichier("t_territoire");
rub_LibelleTerritoire.setAliasFichier("t_territoire");
varSelect.ajouterElement(rub_LibelleTerritoire);
Rubrique rub_VilleId = new Rubrique();
rub_VilleId.setNom("VilleId");
rub_VilleId.setAlias("VilleId");
rub_VilleId.setNomFichier("t_territoire");
rub_VilleId.setAliasFichier("t_territoire");
varSelect.ajouterElement(rub_VilleId);
From varFrom = new From();
Fichier fic_t_territoire = new Fichier();
fic_t_territoire.setNom("t_territoire");
fic_t_territoire.setAlias("t_territoire");
varFrom.ajouterElement(fic_t_territoire);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "t_territoire.VilleId = {ParamVilleId}");
Rubrique rub_VilleId_1 = new Rubrique();
rub_VilleId_1.setNom("t_territoire.VilleId");
rub_VilleId_1.setAlias("VilleId");
rub_VilleId_1.setNomFichier("t_territoire");
rub_VilleId_1.setAliasFichier("t_territoire");
expr__.ajouterElement(rub_VilleId_1);
Parametre param_ParamVilleId = new Parametre();
param_ParamVilleId.setNom("ParamVilleId");
expr__.ajouterElement(param_ParamVilleId);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_LibelleTerritoire_1 = new Rubrique();
rub_LibelleTerritoire_1.setNom("LibelleTerritoire");
rub_LibelleTerritoire_1.setAlias("LibelleTerritoire");
rub_LibelleTerritoire_1.setNomFichier("t_territoire");
rub_LibelleTerritoire_1.setAliasFichier("t_territoire");
rub_LibelleTerritoire_1.ajouterOption(EWDOptionRequete.TRI, "0");
rub_LibelleTerritoire_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "1");
varOrderBy.ajouterElement(rub_LibelleTerritoire_1);
varReqSelect.ajouterClause(varOrderBy);
Limit varLimit = new Limit();
varLimit.setType(0);
varLimit.setNbEnregs(0);
varLimit.setOffset(0);
varReqSelect.ajouterClause(varLimit);
return varReqSelect;
}
public String getNomFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "t_territoire";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "t_territoire";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.finalerte.R.raw.req_communebyprovince;
}
public String getNomFichierWDR()
{
return "req_communebyprovince";
}
}
