# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 05-04-refatorando-codigo-para-usar-o-repositorio-do-sdj
git add .
git commit -m "Refatorando o código do projeto para usar o repositório do SDJ"
git push origin 05-04-refatorando-codigo-para-usar-o-repositorio-do-sdj

git checkout master
git merge --no-ff 05-04-refatorando-codigo-para-usar-o-repositorio-do-sdj
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