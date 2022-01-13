/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_DirectionByEntite
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



public class GWDRREQ_DirectionByEntite extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_DirectionByEntite";
}
public String getCodeSQLOriginal()
{
return " SELECT  t_direction.DirectionId AS DirectionId,\t t_direction.LibelleDirection AS LibelleDirection,\t t_direction.EntiteAccuseId AS EntiteAccuseId,\t t_direction.ProvinceId AS ProvinceId  FROM  t_direction  WHERE   t_direction.EntiteAccuseId = {ParamEntiteAccuseId#0}  ORDER BY  LibelleDirection ASC";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_DirectionId = new Rubrique();
rub_DirectionId.setNom("DirectionId");
rub_DirectionId.setAlias("DirectionId");
rub_DirectionId.setNomFichier("t_direction");
rub_DirectionId.setAliasFichier("t_direction");
varSelect.ajouterElement(rub_DirectionId);
Rubrique rub_LibelleDirection = new Rubrique();
rub_LibelleDirection.setNom("LibelleDirection");
rub_LibelleDirection.setAlias("LibelleDirection");
rub_LibelleDirection.setNomFichier("t_direction");
rub_LibelleDirection.setAliasFichier("t_direction");
varSelect.ajouterElement(rub_LibelleDirection);
Rubrique rub_EntiteAccuseId = new Rubrique();
rub_EntiteAccuseId.setNom("EntiteAccuseId");
rub_EntiteAccuseId.setAlias("EntiteAccuseId");
rub_EntiteAccuseId.setNomFichier("t_direction");
rub_EntiteAccuseId.setAliasFichier("t_direction");
varSelect.ajouterElement(rub_EntiteAccuseId);
Rubrique rub_ProvinceId = new Rubrique();
rub_ProvinceId.setNom("ProvinceId");
rub_ProvinceId.setAlias("ProvinceId");
rub_ProvinceId.setNomFichier("t_direction");
rub_ProvinceId.setAliasFichier("t_direction");
varSelect.ajouterElement(rub_ProvinceId);
From varFrom = new From();
Fichier fic_t_direction = new Fichier();
fic_t_direction.setNom("t_direction");
fic_t_direction.setAlias("t_direction");
varFrom.ajouterElement(fic_t_direction);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "t_direction.EntiteAccuseId = {ParamEntiteAccuseId}");
Rubrique rub_EntiteAccuseId_1 = new Rubrique();
rub_EntiteAccuseId_1.setNom("t_direction.EntiteAccuseId");
rub_EntiteAccuseId_1.setAlias("EntiteAccuseId");
rub_EntiteAccuseId_1.setNomFichier("t_direction");
rub_EntiteAccuseId_1.setAliasFichier("t_direction");
expr__.ajouterElement(rub_EntiteAccuseId_1);
Parametre param_ParamEntiteAccuseId = new Parametre();
param_ParamEntiteAccuseId.setNom("ParamEntiteAccuseId");
expr__.ajouterElement(param_ParamEntiteAccuseId);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_LibelleDirection_1 = new Rubrique();
rub_LibelleDirection_1.setNom("LibelleDirection");
rub_LibelleDirection_1.setAlias("LibelleDirection");
rub_LibelleDirection_1.setNomFichier("t_direction");
rub_LibelleDirection_1.setAliasFichier("t_direction");
rub_LibelleDirection_1.ajouterOption(EWDOptionRequete.TRI, "0");
rub_LibelleDirection_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "1");
varOrderBy.ajouterElement(rub_LibelleDirection_1);
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
case 0 : return "t_direction";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "t_direction";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.finalerte.R.raw.req_directionbyentite;
}
public String getNomFichierWDR()
{
return "req_directionbyentite";
}
}
