# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 12-11-implementando-regra-de-negocio-para-evitar-usuarios-com-emails-duplicados
git add .
git commit -m "Implementando regra de negócio para evitar usuários com e-mails duplicados"
git push origin 12-11-implementando-regra-de-negocio-para-evitar-usuarios-com-emails-duplicados

git checkout master
git merge --no-ff 12-11-implementando-regra-de-negocio-para-evitar-usuarios-com-emails-duplicados
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