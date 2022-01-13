/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Structure
 * Classe Android : FilesPlainte
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



class GWDCFilesPlainte extends WDStructure
{
public WDObjet mWD_FileName = new WDChaineU();
public WDObjet mWD_PlainteId = new WDChaineU();
public WDObjet mWD_TypeContenu = new WDChaineU();



public GWDCFilesPlainte()
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
if(sNomMembre.equals("filename")) return mWD_FileName;
if(sNomMembre.equals("plainteid")) return mWD_PlainteId;
if(sNomMembre.equals("typecontenu")) return mWD_TypeContenu;

return super.getMembreByName(sNomMembre);
}
protected boolean getMembreByIndex(int nIndice, WDClasse.Membre membre)
{
switch(nIndice)
{
case 0 : membre.m_refMembre = mWD_FileName; membre.m_strNomMembre = "mWD_FileName"; membre.m_bStatique = false; membre.m_strNomMembreWL = "FileName"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 1 : membre.m_refMembre = mWD_PlainteId; membre.m_strNomMembre = "mWD_PlainteId"; membre.m_bStatique = false; membre.m_strNomMembreWL = "PlainteId"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;
case 2 : membre.m_refMembre = mWD_TypeContenu; membre.m_strNomMembre = "mWD_TypeContenu"; membre.m_bStatique = false; membre.m_strNomMembreWL = "TypeContenu"; membre.m_bSerialisable = true; membre.m_strNomSerialisation = null; membre.m_strMapping = null; membre.m_nOptCopie = 0; membre.m_nOptCopieEltTableau = 0; return true;

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
