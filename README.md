# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 19-13-corrigindo-link-de-colecao-de-recuso-de-responsaveis-por-restaurante
git add .
git commit -m "Corrigindo link de coleção de recurso de responsáveis por restaurante"
git push origin 19-13-corrigindo-link-de-colecao-de-recuso-de-responsaveis-por-restaurante

git checkout master
git merge --no-ff 19-13-corrigindo-link-de-colecao-de-recuso-de-responsaveis-por-restaurante
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