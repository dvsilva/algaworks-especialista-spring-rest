# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 12-10-um-pouco-mais-sobre-jpa-objeto-alterado-fora-da-transacao-e-sincronizado-com-o-banco-de-dados
git add .
git commit -m "Um pouco mais sobre JPA: objeto alterado fora da transação é sincronizado com o banco de dados"
git push origin 12-10-um-pouco-mais-sobre-jpa-objeto-alterado-fora-da-transacao-e-sincronizado-com-o-banco-de-dados

git checkout master
git merge --no-ff 12-10-um-pouco-mais-sobre-jpa-objeto-alterado-fora-da-transacao-e-sincronizado-com-o-banco-de-dados
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```