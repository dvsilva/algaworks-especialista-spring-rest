# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 05-05-desafio-refatorando-todos-os-repositorios-para-usar-sdj
git add .
git commit -m "Desafio: refatorando todos os repositórios para usar SDJ"
git push origin 05-05-desafio-refatorando-todos-os-repositorios-para-usar-sdj

git checkout master
git merge --no-ff 05-05-desafio-refatorando-todos-os-repositorios-para-usar-sdj
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