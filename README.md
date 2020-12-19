# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 07-12-desafio-criando-migracoes-e-mapeando-entidades-pedido-e-itempedido
git add .
git commit -m "Desafio: Criando migrações e mapeando as entidades Pedido e ItemPedido"
git push origin 07-12-desafio-criando-migracoes-e-mapeando-entidades-pedido-e-itempedido

git checkout master
git merge --no-ff 07-12-desafio-criando-migracoes-e-mapeando-entidades-pedido-e-itempedido
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