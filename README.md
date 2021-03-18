# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 20-05-evitando-quebrar-os-clientes-alteracao-na-estrutura-de-dados-do-modelo
git add .
git commit -m "Evitando quebrar os clientes: alteração na estrutura de dados do modelo"
git push origin 20-05-evitando-quebrar-os-clientes-alteracao-na-estrutura-de-dados-do-modelo

git checkout master
git merge --no-ff 20-05-evitando-quebrar-os-clientes-alteracao-na-estrutura-de-dados-do-modelo
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