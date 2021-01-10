# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 11-07-configurando-e-refatorando-o-projeto-para-usar-utc
git add .
git commit -m "Configurando e refatorando o projeto para usar UTC"
git push origin 11-07-configurando-e-refatorando-o-projeto-para-usar-utc

git checkout master
git merge --no-ff 11-07-configurando-e-refatorando-o-projeto-para-usar-utc
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