/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Structure
 * Classe Android : Commune
 * Date : 24/10/2021 18:20:32
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.application.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



class GWDCCommune extends WDStructure
{
public WDObjet mWD_Id = new WDEntier4();
public WDObjet mWD_LibelleTerritoire = new WDChaineU();
public WDObjet mWD_VilleId = new WDEntier4();



public GWDCCommune()
{
}

public WDProjet getProjet()
{
return GWDPTono_CF.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTono_CF.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
protected WDObjet getMembreByName(String sNomMembre)
{
if(sNomMembre.equals("id")) return mWD_Id;
if(sNomMembre.equals("libelleterritoire")) return mWD_LibelleTerritoire;
if(sNomMembre.equals("villeid")) return mWD_VilleId;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_Id; membre.m_strNomMembre = "mWD_Id"; membre.m_bStatique = false; membre.m_strNomMembreWL = "Id"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 1 : membre.m_refMembre = mWD_LibelleTerritoire; membre.m_strNomMembre = "mWD_LibelleTerritoire"; membre.m_bStatique = false; membre.m_strNomMembreWL = "LibelleTerritoire"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 2 : membre.m_refMembre = mWD_VilleId; membre.m_strNomMembre = "mWD_VilleId"; membre.m_bStatique = false; membre.m_strNomMembreWL = "VilleId"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;

default: return super.getMembreByIndex(nIndice - 3, membre);
}
}
protected WDPropriete getProprieteByName(String sNomPropriete)
{
return super.getProprieteByName(sNomPropriete);
}
protected WDPropriete getProprieteByIndex(int nIndice)
{
switch(nIndice)
{
default: return super.getProprieteByIndex(nIndice - 0);
}
}
}
