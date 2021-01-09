# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 10-02-preparando-projeto-para-testes-de-integracao
git add .
git commit -m "Preparando o projeto para testes de integração"
git push origin 10-02-preparando-projeto-para-testes-de-integracao

git checkout master
git merge --no-ff 10-02-preparando-projeto-para-testes-de-integracao
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