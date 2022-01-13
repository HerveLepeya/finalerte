/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Requête
 * Classe Android : REQ_TypePlainteByEntite
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



public class GWDRREQ_TypePlainteByEntite extends WDDescRequeteWDR
{
public String getNomLogique()
{
return "REQ_TypePlainteByEntite";
}
public String getCodeSQLOriginal()
{
return " SELECT  t_typeplainte.TypePlainteId AS TypePlainteId,\t t_typeplainte.LibelleTypePlainte AS LibelleTypePlainte,\t t_typeplainte.EntiteAccuseId AS EntiteAccuseId  FROM  t_typeplainte  WHERE   t_typeplainte.EntiteAccuseId = {ParamEntiteAccuseId#0}  ORDER BY  LibelleTypePlainte ASC";
}
public Requete initArbre() throws WDInvalidSQLException
{
Select varSelect = new Select();
varSelect.setType(1);
Rubrique rub_TypePlainteId = new Rubrique();
rub_TypePlainteId.setNom("TypePlainteId");
rub_TypePlainteId.setAlias("TypePlainteId");
rub_TypePlainteId.setNomFichier("t_typeplainte");
rub_TypePlainteId.setAliasFichier("t_typeplainte");
varSelect.ajouterElement(rub_TypePlainteId);
Rubrique rub_LibelleTypePlainte = new Rubrique();
rub_LibelleTypePlainte.setNom("LibelleTypePlainte");
rub_LibelleTypePlainte.setAlias("LibelleTypePlainte");
rub_LibelleTypePlainte.setNomFichier("t_typeplainte");
rub_LibelleTypePlainte.setAliasFichier("t_typeplainte");
varSelect.ajouterElement(rub_LibelleTypePlainte);
Rubrique rub_EntiteAccuseId = new Rubrique();
rub_EntiteAccuseId.setNom("EntiteAccuseId");
rub_EntiteAccuseId.setAlias("EntiteAccuseId");
rub_EntiteAccuseId.setNomFichier("t_typeplainte");
rub_EntiteAccuseId.setAliasFichier("t_typeplainte");
varSelect.ajouterElement(rub_EntiteAccuseId);
From varFrom = new From();
Fichier fic_t_typeplainte = new Fichier();
fic_t_typeplainte.setNom("t_typeplainte");
fic_t_typeplainte.setAlias("t_typeplainte");
varFrom.ajouterElement(fic_t_typeplainte);
Requete varReqSelect = new Requete(1);
varReqSelect.ajouterClause(varSelect);
varReqSelect.ajouterClause(varFrom);
Expression expr__ = new Expression(9, "=", "t_typeplainte.EntiteAccuseId = {ParamEntiteAccuseId}");
Rubrique rub_EntiteAccuseId_1 = new Rubrique();
rub_EntiteAccuseId_1.setNom("t_typeplainte.EntiteAccuseId");
rub_EntiteAccuseId_1.setAlias("EntiteAccuseId");
rub_EntiteAccuseId_1.setNomFichier("t_typeplainte");
rub_EntiteAccuseId_1.setAliasFichier("t_typeplainte");
expr__.ajouterElement(rub_EntiteAccuseId_1);
Parametre param_ParamEntiteAccuseId = new Parametre();
param_ParamEntiteAccuseId.setNom("ParamEntiteAccuseId");
expr__.ajouterElement(param_ParamEntiteAccuseId);
Where varWhere = new Where();
varWhere.ajouterElement(expr__);
varReqSelect.ajouterClause(varWhere);
OrderBy varOrderBy = new OrderBy();
Rubrique rub_LibelleTypePlainte_1 = new Rubrique();
rub_LibelleTypePlainte_1.setNom("LibelleTypePlainte");
rub_LibelleTypePlainte_1.setAlias("LibelleTypePlainte");
rub_LibelleTypePlainte_1.setNomFichier("t_typeplainte");
rub_LibelleTypePlainte_1.setAliasFichier("t_typeplainte");
rub_LibelleTypePlainte_1.ajouterOption(EWDOptionRequete.TRI, "0");
rub_LibelleTypePlainte_1.ajouterOption(EWDOptionRequete.INDEX_RUB, "1");
varOrderBy.ajouterElement(rub_LibelleTypePlainte_1);
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
case 0 : return "t_typeplainte";
default: return null;
}
}
public String getAliasFichier(int nIndex)
{
switch(nIndex)
{
case 0 : return "t_typeplainte";
default: return null;
}
}


public int getIdWDR()
{
return com.masociete.finalerte.R.raw.req_typeplaintebyentite;
}
public String getNomFichierWDR()
{
return "req_typeplaintebyentite";
}
}
